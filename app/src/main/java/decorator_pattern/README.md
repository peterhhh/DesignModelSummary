#装饰者模式
就是扩展已有的类，但不改变其结构。

##主要解决
一般情况下，扩展一个类都是通过继承，但是随着扩展功能的增多可能会造成子类膨胀

##如何解决
将具体功能职责划分，同时继承装饰者类

##优点
装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能
##缺点
多层装饰会比较复杂

##使用场景
    1、扩展一个类的功能
    2、动态增加功能，动态撤销
    
    
**demo介绍**

_英雄具有技能栏属性，技能栏有技能可以点击学习，这里就相当于给Hero接口进行装饰，让其具有了技能栏，
然后对技能栏类进行装饰，让其具有具体的技能_


