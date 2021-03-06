# 单一职责原则

# 定义：
不要存在多于一个导致类变更的原因。通俗的说，即一个类只负责一项职责。 

# 问题由来：
类T负责两个不同的职责：职责P1，职责P2。  
当由于职责P1需求发生改变而需要修改类T时，
有可能会导致原本运行正常的职责P2功能发生故障。

# 解决方案：
遵循单一职责原则。分别建立两个类T1、T2，使T1完成职责P1功能，T2完成职责P2功能。  
这样，当修改类T1时，不会使职责P2发生故障风险；  
同理，当修改T2时，也不会使职责P1发生故障风险。

# 遵循单一职责原的优点有
* 可以降低类的复杂度，一个类只负责一项职责，
其逻辑肯定要比负责多项职责简单的多；
* 提高类的可读性，提高系统的可维护性；
* 变更引起的风险降低，变更是必然的，如果单一职责原则遵守的好，
当修改一个功能时，可以显著降低对其他功能的影响。

# 其他
需要说明的一点是单一职责原则不只是面向对象编程思想所特有的，
只要是模块化的程序设计，都适用单一职责原则。