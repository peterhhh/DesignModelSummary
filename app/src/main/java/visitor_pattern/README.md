#访问者模式
使用一个访问者类，它改变了元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变。


##意图
主要将数据结构和数据操作分离

##何时使用
需要对一个对象结构中的对象进行很多不同的且不相关的操作，而需要避免这些操作"污染"这些对象的类，使用访问者模式将这些操作封装到类中

##如何解决
在被访问的类中加一个对外提供接待访问者的接口


##应用实例
去朋友家做客，我是访问者，朋友接受我的访问，我通过朋友的描述，对朋友的描述做出判断，这就是访问者模式


##优点
    1、符合单一职责原则
    2、扩展性、灵活性

##缺点
    1、具体元素对访问者公布细节，违反了迪米特原则
    2、具体元素变更比较困难
    3、违反了依赖倒置原则，依赖了具体类，没有依赖抽象。
    

##注意事项
    访问者可以对功能进行统一，可以做报表，UI、过滤器、拦截器
    
    



