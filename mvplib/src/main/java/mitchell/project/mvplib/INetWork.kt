package mitchell.project.mvplib

/**
 * 网络处理接口
 */
interface INetWork {

    /**
     * Post请求，有标识的
     * @param cls 类名
     * @param jsonString Json请求字符串
     * @param callBack 请求回调
     */
    fun post(cls: String, jsonString: String, callBack: INetCallBack)

    /**
     * 无标识post请求
     * @param jsonString Json请求字符串
     * @param callBack 请求回调
     */
    fun post(jsonString: String, callBack: INetCallBack)

    /**
     * get请求
     * @param cls 类名
     * @param url 请求地址
     * @param callBack 请求回调
     */
    fun get(cls: String, url: String, callBack: INetCallBack)

    /**
     * 无标识Get请求
     * @param url 请求地址
     * @param callBack 请求回调
     */
    fun get(url: String, callBack: INetCallBack)

    /**
     * 取消请求
     */
    fun cancel()
}