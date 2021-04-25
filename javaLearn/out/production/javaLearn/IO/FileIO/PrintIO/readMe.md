##PrintStream

* printStream是一个输出流  字节流

* System.out 是 PrintStream的一个实例 
* 其中的println方法功能很强大  
    * 因为普通的输出流就不能输出各种对象，只能输入一个字符/字节  或者数组
    * 缺点 ： 所有类型输出全部转化成字符串
        * 写入到文件中全部转换成字符串， 需要使用特殊的字符来区分各个内容，防止混淆
            * 123#3.14#asdj#小明
        * 读取时还需要将字符串转换成真实类型
    * DataInputStream和DataOutputStream可以解决上面的缺点
    
## PrintWriter