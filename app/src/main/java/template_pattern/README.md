#模板模式
一个抽象类公开定义了执行它的方法/模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行

什么意思呢？就比如说，我抽象类中定义了几个抽象方法，然后定义一个final类型的方法，这个方法里面调用了这些抽象方法，因为final修饰的方法是不允许被继承的
所以就这个final类型的方法就相当于一个模板一样，写死了。但是这个模板里面的方法还是调用的具体实现类中的实现的方法




##意图
定义一个操作中算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤

##主要解决
一些方法通用，却在每一个子类都重写了这一方法。

##如何解决
将这些通用算法抽象出来

##关键代码
在抽象类实现，其他步骤在子类实现


##优点
    1、封装不变部分，扩展可变部分
    2、提取公共代码，便于维护
    3、行为由父类控制，子类实现
    
    
##缺点
    1、每一个不同的实现都需要一个子类来实现
    
