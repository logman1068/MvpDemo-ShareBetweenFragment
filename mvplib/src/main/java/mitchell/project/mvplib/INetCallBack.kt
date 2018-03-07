package mitchell.project.mvplib

/**
 * 网络请求回调
 */
interface INetCallBack {

    /**
     * 请求成功回调
     */
    fun onSuccess()

    /**
     * 请求失败回调
     */
    fun onFailed()
}