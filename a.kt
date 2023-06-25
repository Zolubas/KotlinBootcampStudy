//============================== SDK-V4 ==== BatteryChargeRemaing ==========================================
  
override fun getChargeRemainingPercent(): Flow<Int> = callbackFlow {
        //key creation
        val chargeKey =
            BatteryKey.create(BatteryKey.CHARGE_REMAINING_IN_PERCENT)

        val gpsKey =
            FlightControllerKey.create(FlightControllerKey.GPS_SIGNAL_LEVEL)


        //get current value
        DJISDKManager.getInstance().keyManager!!.getValue(
            chargeKey,
            object : GetCallback {
                override fun onSuccess(value: Any) {
                    if (value is Int) {
                        val bat: Int =
                            value as Int
                        trySend(bat)
                    }
                }

                override fun onFailure(error: DJIError) {}
            })


        //callback definition
        val listener = KeyListener { oldValue, newValue ->
            if (newValue is Int) {
                trySend(newValue)
                Log.d("test", newValue.toString())
            }
        }

        DJISDKManager.getInstance().keyManager?.addListener(chargeKey, listener)

        awaitClose {
            DJISDKManager.getInstance().keyManager?.removeListener(listener)
        }


    }

//============================== SDK-V5 ==== BatteryChargeRemaing ==========================================

override fun getChargeRemainingPercent(): Flow<Int> = callbackFlow {
        //1) key creation -> Representacao da carga da bateria
        //esse pedaco de codigo da um nome para a variavel que guardara o valor percentual restante
        //da bateria. Isto eh, esse pedaco de codigo instancia isso.
        val chargeKey =
            BatteryKey.KeyChargeRemainingInPercent.create()
        //2) Pega o valor da carga -> Com isso ja temos o valor atual pois a parte 3) so detecta quando o valor muda.
        //nesse caso, supondo que a bateria comece em 100%, sem essa linha o primeiro valor lido seira quando o percentual
        //mudar de 100% para 99%, ou seja, o primeiro valor seria 99%
        trySend(chargeKey.get(0))
        //3) Se inscreve pra pegar atualizacoes do valor
        chargeKey.listen(holder = 0, onChange = {
            if (it is Int) {
                trySend(it)
                Log.d("test", it.toString())
            }
        })
        //4) Com cancelar o listen quando o Flow é interrompido
        //esse pedaco de codigo ensina o callbackFlow como deixar de receber atualizações quando o fluxo
        //de informacoes sobre a bateria cessa
        awaitClose {
            chargeKey.cancelListen()
        }
        
        //5) Callback definition
        val batteryListener: CommonCallbacks.KeyListener<Int> =  CommonCallbacks.KeyListener<Int> { oldValue, newValue ->
            if (newValue is Int) {
                Log.d("test", newValue.toString())
            }
        }
        
    }


//============================== SDK-V4 ==== GenericImplementation ==========================================
fun <T> keyedInterface(
        key: DJIKey,
        compareType: (Any?) -> Boolean
        ): Flow<T> = callbackFlow {
        //get current value
        DJISDKManager.getInstance().keyManager!!.getValue(
            key,
            object : GetCallback {
                override fun onSuccess(value: Any) {
                    if (compareType(value)) {
                        val bat: T =
                            value as T
                        trySend(bat)
                    }
                }

                override fun onFailure(error: DJIError) {}
            })


        //callback definition
        val listener = KeyListener { _, newValue ->
            if (compareType(newValue)) {
                trySend(newValue as T)
            }
        }

        DJISDKManager.getInstance().keyManager?.addListener(key, listener)

        awaitClose {
            DJISDKManager.getInstance().keyManager?.removeListener(listener)
        }
    }
