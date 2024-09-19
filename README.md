# [首页查询更多项目](https://github.com/GraduationProject-weixin) 包安装运行


# 50087wxapp社区养老服务

![picture](https://raw.githubusercontent.com/GraduationProject-springboot/.github/main/img/wx.png)

### 点击播放视频 ▼
[![Watch the video](https://i.sstatic.net/Vp2cE.png)](https://www.bilibili.com/video/BV1BPtKekEv3?p=90)


# 第1章  绪论
## 1.1研究背景
二十一世纪是一个集数字化，网络化，信息化的，以网络为核心的社会。随着互联网的发展，传统生活变得更加方便快捷，许多事物都可以跟互联网相连接，于是就提出了“互联网+”[1]的概念，日常生活离不开计算机更离不开互联网，例如生活中最平常的衣食住行，都有其相关的智能产品，所以科技改变生活，传统的生活方式面对互联网的新浪潮的冲击，已经渐渐退出了历史舞台，相信未来的某一时刻，传统的生活方式将进入全智能化的阶段。现今各种智能手机层出不穷，各类基于手机平台的软件应运而生，其中，在众多交流软件中，微信备受人们青睐，近年来，微信发展规模越来越大，越来越多的人开始使用微信，目前智能手机系统的普及，人们手机上基本都有了微信，据调查发现，中国约90%的人选择使用微信，这使得基于微信小程序的系统越来越多，无需安装，让人们使用更加便利。

基于以上微信的发展，结合目前社区养老服务方面的需求，开发了本社区养老服务小程序系统，为用户提供一个便利的查看服务、服务预约、投诉以及查看活动的平台。
## 1.2设计原则
在开始开发项目之前，必须要先考虑项目的实用性、科学性，以及该项目是否能够真正让用户受益并尽可能的发挥项目的作用。因此，在开发前，通过以下几条原则对项目进行判断：

（1）可行性原则。项目需要保证经济可行性和技术可行性，这包括了项目在浏览端、服务端等方面上的经济和技术上是可以达成的。

（2）适应性原则。项目要保证可维护性和可扩展性，这是每个非短期项目都需要考虑的，并且不论是维护还是扩展，都必须要建立在适应用户的正常需求的基础上。

（3）安全性及保密性原则。要充分保证用户信息的安全性和保密性，不能因为开发上的疏忽，导致用户的信息泄露。

（4）系统工程原则。为了确保项目的整体性，在项目调查、项目分析、项目设计、项目开发的过程中，都需遵从项目工程的方法和步骤逐步进行。

（5）统一规划、分期实施、逐步完善原则。项目开发的过程中，要按照规划、分期实施，特别是要注意在项目开发过程中要有条理，从点到面，一步步完善，不要贪图进度，要循环渐进的对项目进行开发。
## 1.3研究内容

根据基于微信小程序的社区养老服务系统编写的论文主要阐述了基于微信小程序的社区养老服务系统的开发过程中使用的技术，系统开发前进行的需求分析，根据需求文档进行系统设计，最后才是系统功能实现以及测试几个部分，在开始编写论文之前亲自到图书馆借阅Java书籍，MYSQL数据库书籍等编程书籍，然后针对开发的社区养老服务小程序系统，去网上查找了很多别人做好的系统，根据他们的功能设计进行自己的系统的系统功能结构设计，出具需求报告，根据形成的需求报告完成系统各个功能模块设计，最后才是进行程序编码，系统完成后才能进行测试和最后的验收工作，程序开发流程大致如此。

这次编写的论文包含了6个部分的内容，具体内容如下：

第一部分绪论：文章主要从课题背景以及设计原则综合阐述了开发此系统的必要性。

第二部分相关技术：系统开发用到的各种技术都大致做出了简介

第三部分系统分析：从可行性分析和功能需求分析等角度综合研究了此次开发的系统

第四部分系统设计：功能模块设计和数据库设计这两部分内容都有专门的表格和图片表示

第五部分系统实现：主要是根据需求文档和系统设计内容进行文字编码

第六部分系统测试：检验程序是否达到预期目标

第七部分总结。


#
28

第2章 关键技术简介
# 第2章  关键技术简介
## 2.1微信Web开发者工具
为了实现微信小程序编写，腾讯公司推出微信web开发者工具[2]，用来调试编写微信小程序，微信小游戏，微信公众号的编写和调试，该软件是支持微信小程序官方API 和相应的辅助工具和插件，支持微信端的代码编辑，查看，预览，发布。该工具拥有自己的前端代码文件，视图文件是.wxml、样式文件是.wxss、交互则是JS文件[8]，当然还有支持相应的网络框架，通过接口wx.request和后台进行数据传输，通过配置https域名配置跟服务器对接并发布项目，这是一款集开发、预览、发布等功能的微信产品的开发工具，目前还在更新版本。
## 2.2微信小程序API接口
微信小程序API接口是腾讯公司为了微信小程序和微信公众号提供的接口文档，里面包含了各种需要使用的接口技术[7]，例如本项目用到的获取微信用户信息(wx.getUserInfo)、蓝牙通讯传输功能、网络请求(wx.request)、定位功能等，总的来说，小程序API是满足一个程序开发的大部分接口。
## 2.3 MYSQL数据库
在数据库方面采用当前主流的MySQL数据库，MySQL具有开放性，它是一种关系型数据库管理系统，并且它的源代码可以被大众所熟知。由于MySQL是开放源代码的，因此，只要经过授权就可以在自己需求的基础上对其进行修改。MySQL因为其固有的特点而备受关注，它具有很强的适应性，并且十分可靠，查询速度快。MySQL安装起来非常方便，且数据存储量大，不需要事务化处理。Sql语言拥有很多的方法，在项目中编写sql语句时使用起来是非常方便的，不会像其他语言那样需要编写更多的语句。正因为MySQL使用sql语言进行数据库管理，所以它收到了大多数程序员的热爱。
## 2.4 Java简介
Java是一种非常常用的编程语言，在全球编程语言排行版上总是前三。在方兴未艾的计算机技术发展历程中，Java的身影无处不在，并且拥有旺盛的生命力。Java的跨平台能力十分强大，只需一次编译，任何地方都可以运行。除此之外，它还拥有简单的语法和实用的类库，让编程人员可以尽可能将精力集中在问题的求解上，并且许多开源项目和科研成果都是采用它实现的。

在1995年这一年的5月份，著名的Sun Microsystems公司在程序开发设计上面郑重推出一种面向对象开发的程序设计语言——Java，最开始的时候Java是由詹姆斯.高斯林这位伟大的JAVA之父来进行主导，但是在后来由于各种原因，让甲骨文公司这个针对商业程序创建了oracle大型数据库的公司收购了Java。Java的平台总共算下来有3个，分别为javaME和javaSE以及javaEE这3个java平台。下面将对其进行分别介绍。

（1）在电脑桌面程序的开发上面需要选择JavaME，这个用得也比较多。

（2）企业也会根据工作以及业务需要开发各种软件，那么就会选用JavcEE这个支持企业版软件的开发的Java平台，JavcEE主攻运用在企业领域上面的web应用，JavcEE也在javaSE的基础上获得了比如jsp技术，Servlet技术等程序开发技术的支持。

（3）现在生活中手机的普及化，也使得手机端这样的移动设备的软件的兴起，JavaME这个迷你版java平台就能运用于移动端的软件开发操作。
#
第3章 系统分析
# 第3章  系统分析
## 3.1 可行性分析
在系统开发之初要进行系统可行分析，这样做的目的就是使用最小成本解决最大问题，一旦程序开发满足用户需要，带来的好处也是很多的。下面我们将从技术上、经济上、操作上、法律上等方面来考虑这个系统到底值不值得开发。
### 3.1.1技术可行性
技术可行性是指学习的技术是否能够完成本项目，如果团队本身没有相关的技术储备，而又能够迅速掌握此类技术，那项目应该达不到我们的设计要求。本基于微信小程序的社区养老服务系统采用JAVA技术、MYSQL数据库开发设计，作为计算机专业学生，在学校期间就接触到许多关于编程方面的知识，当然也包括各种编程软件，对他们的了解度也比较系统，所以技术开发上面还是有一定把握。
### 3.1.2 经济可行性
由于自己本身就是学生，还没有正式参加工作，金钱上面一直都处于缺乏状态。所以在开发程序过程中，我是不会花太多经济成本在上面的。针对开发软件和数据库，还有界面设计的photoshop软件等在百度上面就可以直接下载，然后根据各种安装视频进行安装，这些资源都是免费的，程序编码阶段使用的源代码在百度上面可以轻松获得，在有网络的环境下就能下载下来，不需要支付任何费用，经济成本很低。
### 3.1.3 操作可行性
操作可行性主要是针对系统用户而言，一个系统再完美，技术再先进，用户不去使用，或者用户根本不会使用，该系统存在的价值也是不大的。本人自己就是学生，程序开发经验不足，在界面设计上面不会设计太复杂，要讲究简单好看，操作上要方便，不能让用户觉得不流畅。用户一旦进入操作界面，界面上就会有相应提示，跟着操作提示就可以找到对应的功能操作模块，对于用户来说免培训就能使用，没有任何学习成本，因此，操作上是可行性的。
### 3.1.4法律可行性
自己本人开发的软件和用到的资料来源都是图书馆、百度文库、百度网页等渠道，并不涉及违法。在个人毕业设计上面，无论源代码还是论文编写内容不存在抄袭行为。

从上面几个部分的可行性分析得出，这次开发的基于微信小程序的社区养老服务系统在开发上面没有什么大问题，值得开发。
## 3.2 系统性能分析
（1）可升级性：系统的容纳信息一定是持续增长，到时系统可以升级，接受信息的更新发展。

（2）存储性：因为是社区养老服务系统，所以就会在数据库要求上比较严格，信息录入的比较多，而且丰富复杂， 这就需要一个强大的数据库来存放更多的数据和保证数据的时时性。

（3）可靠性：系统不可以有病毒类代码，必须有拦截器，验证方法，对里面信息的保护措施，这样才让人用的放心。

（4）简单性：系统设计的应该简单易学的，设计的各种功能应该简单操作，不需要努力学习培训，缩短用户熟悉系统的进程。

（5）一致性：数据应该录入准确，需要更新时，数据应该可以及时的修改，数据还应该有独立保存，不能删除数据的时候会连带着把还需要的数据都删除掉。
## 3.3 系统功能分析
本基于微信小程序的社区养老服务系统实现了用户功能模块、服务人员模块和管理员功能模块三大部分，具体如下。

（1）用户功能模块

用户通过微信平台打开本系统，注册登录后可主要功能模块包括首页、停车位、电话本、市集信息、社区论坛以及我的（停车位、车位预约、费用信息、电话本、市集信息、我要发帖和我的发帖）。

（2）管理员功能模块

管理员登录后台可对后台的数据进行全面管理，包括个人中心、用户管理、服务人员管理、服务产品管理、服务预约管理、服务状态管理、服务退订管理、活动管理视频管理、用户通知管理、用户待办事项管理、用户已完成时限管理、服务人员通知管理、服务人员待办事项管理、服务人员已完成事项管理、用户投诉管理、撤销投诉管理以及系统管理。

（3）服务人员功能模块

服务人员登录后主要功能模块包括个人中心、用户管理、服务产品管理、服务预约管理、服务状态管理、服务退订管理、活动管理、视频管理、服务人员通知管理、服务人员待办事项管理、服务人员已完成事项管理、用户投诉管理、撤销投诉管理以及系统管理。
## 3.4 系统流程分析
### 3.4.1登录流程
管理员、服务人员和用户均有登录功能，在对于角色的登录页面输入登录信息实现登录，登录流程图如图3.1所示。

![](/md/blog.002.png)

图3.1登录流程图
### 3.4.2添加信息流程
添加信息时系统会对添加的信息进行验证，验证通过才能添加成功，添加信息流程图如图3.2所示

![](/md/blog.003.png)

图3.2 添加信息流程图
### 3.4.3注册流程
没有账号的用户可进行注册操作，用户注册流程图如图3.3所示。

![](/md/blog.004.png)

图3.3 注册流程图
### 3.4.4修改密码流程
管理员和服务人员均可修改个人登录密码，修改密码流程图如图3.4所示。

![](/md/blog.005.png)

图3.4 修改密码流程图

#
第4章 系统设计
# 第4章  系统设计
## 4.1系统设计要求
（1）可用性。目标系统功能齐全，能够完全满足用户需求。

（2）可靠性。能连续准确的处理业务，有较强的容错能力。

（3）保密性。保证系统的物理安全、数据存储和存取的安全与保密、数据传输的安全与保密，做好使用人员的授权管理。

（4）可理解性。用户容易理解和使用该系统。

（5）可维护性和适应性。系统应易于修改、易于扩充、易于维护，能够适应业务不断发展变化的需要。
## 4.2系统开发流程设计
在开发本基于微信小程序的社区养老服务系统时，首先进行需求分析，进而对系统进行总体的设计规划，设计系统功能模块，数据库的选择等，本系统的开发流程如图4.1所示

![](/md/blog.006.png)

图4.1 系统开发流程图
## 4.3系统结构设计
在整个设计过程，以确定可能的具体方案达成每一个小的最终目标，对于每一个小的目标而言，我们必须先了解一些相关的需求分析的信息。然后对系统进行初步的设计，并对其逐渐进行优化，设计出一个具体可实现的系统结构。

本基于微信小程序的社区养老服务系统主要包括用户模块、服务人员模块以及管理员模块三大部分，系统结构图如图4.2所示：

![](/md/blog.007.png)

图4.2系统功能结构图
## 4.4系统数据库设计
### 4.4.1 数据库E-R图设计
本基于微信小程序的社区养老服务系统采用的是MYSQL数据库，数据存储快，因为基于微信小程序的社区养老服务系统，主要的就是对信息的管理，信息内容比较多，这就需要好好的设计一个好的数据库，分类要清楚，不能添加信息的时候，造成信息太过混乱，设计好的数据库首先就需要先把各个实体之间的关系表达明确，下面我们用E-R图来具体表示。

E-R图是一种描述显示数据类型间的关系的数据描述方法，E-R图可以完整地映射出现实模型的关系。E-R图中的三个最为重要的元素就是实体、属性、关系。E-R图即由这三点组成。本基于微信小程序的社区养老服务系统的E-R图如下所示：

（1）服务产品信息实体E- R图，如图4.4所示

![](/md/blog.008.png)

图4.4 服务产品信息实体属性图

（2）服务人员信息实体E- R图，如图4.5所示

![](/md/blog.009.png)

图4.5  服务人员信息实体属性图

（3）管理员信息实体E- R图，如图4.6所示

![](/md/blog.010.png)

图4.6  管理员信息实体属性图

（4）用户信息实体E- R图，如图4.7所示

![](/md/blog.011.png)

图4.7 用户信息实体属性图

（5）服务人员通知实体E- R图，如图4.8所示

![](/md/blog.012.png)

图4.8 服务人员通知实体属性图
### 4.4.2 数据库表设计
本基于微信小程序的社区养老服务系统采用MYSQL数据库，数据库的功能主要是存储网站中所有数据，以便进行操作。关于数据库中的数据表如下：

表4.1  fuwuchanpin服务产品信息表

|序号|字段|描述|类型和长度|主键|是否可空|
| :-: | :-: | :-: | :-: | :-: | :-: |
|1|id|编号|bigint(20)|是|不允许|
|2|addtime|创建时间|timestamp|否|允许|
|3|fuwumingcheng`|服务名称|varchar(200)|否|允许|
|4|fuwuleixing|服务类型|varchar(200)|否|允许|
|5|fuwujieshao|服务介绍|longtext|否|允许|
|6|fuwurenyuan|服务人员|varchar(200)|否|允许|
|7|fuwurenyuanjieshao|服务人员介绍|longtext|否|允许|
|8|`tupian|图片|varchar(200)|否|允许|
|9|thumbsupnum|赞数|int(11)|否|允许|
|10|crazilynum`|踩数|int(11)|否|允许|

表4.2  fuwurenyuan服务人员信息表

|序号|字段|描述|类型和长度|主键|是否可空|
| :-: | :-: | :-: | :-: | :-: | :-: |
|1|id|编号|bigint(20)|是|不允许|
|2|addtime|创建时间|timestamp|否|允许|
|3|zhanghao|账号|varchar(200)|否|允许|
|4|mima|密码|varchar(200)|否|允许|
|5|xingming|姓名|varchar(200)|否|允许|
|6|xingbie|性别|varchar(200)|否|允许|
|7|shenfenzheng|身份证|varchar(200)|否|允许|
|8|shouji|手机|varchar(200)|否|允许|
|9|youxiang|邮箱|varchar(200)|否|允许|
|10|zhaopian|照片|varchar(200)|否|允许|

表4.3   users管理员信息表

|序号|字段|描述|类型和长度|主键|是否可空|
| :-: | :-: | :-: | :-: | :-: | :-: |
|1|id|编号|bigint(20)|是|不允许|
|2|username|用户名|varchar(100)|否|允许|
|3|password|密码|varchar(100)|否|允许|
|4|role|角色|varchar(100)|否|允许|
|5|addtime|添加时间|timestamp|否|允许|

表4.4  yonghu用户信息表

|序号|字段|描述|类型和长度|主键|是否可空|
| :-: | :-: | :-: | :-: | :-: | :-: |
|1|id|编号|bigint(20)|是|不允许|
|2|addtime|创建时间|timestamp|否|允许|
|3|zhanghao|账号|varchar(200)|否|允许|
|4|xingming|姓名|varchar(200)|否|允许|
|5|mima|密码|varchar(200)|否|允许|
|6|`xingbie|性别|varchar(200)|否|允许|
|7|nianling`|年龄|int(11)|否|允许|
|8|shenfenzheng``|身份证|varchar(200)|否|允许|
|9|shouji|手机|varchar(200)|否|允许|
|10|youxiang`|邮箱|varchar(200)|否|允许|
|11|zhaopian|照片|varchar(200)|否|允许|

表4.5  fuwurenyuantongzhi服务人员通知信息表

|序号|字段|描述|类型和长度|主键|是否可空|
| :-: | :-: | :-: | :-: | :-: | :-: |
|1|id|编号|bigint(20)|是|不允许|
|2|addtime|创建时间|timestamp|否|允许|
|3|mingcheng|名称|varchar(200)|否|允许|
|4|`shijian`|时间|date|否|允许|
|5|neirong|内容|longtext|否|允许|
|6|tupian|图片|varchar(200)|否|允许|
|7|thumbsupnum|赞数|int(11)|否|允许|
|8|crazilynum`|踩数|int(11)|否|允许|
|9|clicktime|最近点击时间|datetime|否|允许|



#
第5章 系统的实现
# 第5章 系统的实现
## 5.1微信端功能模块的实现
### 5.1.1微信端注册登录界面
没有账号的用户可进行注册操作，注册后可进行登录系统，在登录时可选择登录类型，微信端注册登录界面展示如图5.1所示。

![](/md/blog.013.png)![](/md/blog.014.png)

图5.1 微信端注册登录界面
### 5.1.2首页界面
用户登录后可进入首页查看相关信息，首页界面展示如图5.2所示。

![](/md/blog.015.png)

图5.2首页界面
### 5.1.3服务产品详情界面
用户可选择服务产品查看详情信息，并可进行预约和投诉操作，服务产品详情界面展示如图5.3所示。

![](/md/blog.016.png)

图5.3 服务产品详情界面
### 5.1.4服务投诉界面
用户可进行服务投诉操作，服务投诉界面展示如图5.4所示。

![](/md/blog.017.png)

图5.4 服务投诉界面
### 5.1.5服务预约界面
用户登录后可选择服务进行预约操作，服务预约界面展示如图5.5所示。

![](/md/blog.018.png)

图5.5  服务预约界面
### 5.1.6我的界面
用户在我的界面可选择模块进行相应操作，我的界面展示如图5.6所示。

![](/md/blog.019.png)

图5.6 我的界面
## 5.2服务端功能模块的实现
### 5.2.1服务端登录界面
管理员和服务人员要想进入对于角色后台进行管理操作，必须登录对应角色后台，服务端登录界面展示如图5.7所示。

![](/md/blog.020.png)

图5.7服务端登录界面
### 5.2.2用户管理界面
管理员和服务人员均可进行用户管理操作，用户管理界面如图5.8所示。

![](/md/blog.021.png)

图5.8  用户管理界面
### 5.2.3服务人员管理界面
管理员在服务人员管理界面可查看所有服务人员信息，对已有服务人员信息可进行编辑和删除操作，服务人员管理界面如图5.9所示。

![](/md/blog.022.png)

图5.9  服务人员管理界面
### 5.2.4服务产品管理界面
管理员和服务人员均可增删改查服务产品信息，服务产品管理界面展示如图5.10所示。

![](/md/blog.023.png)

图5.10  服务产品管理界面
### 5.2.5服务预约管理界面
管理员和服务人员均可查看服务预约信息，并可对其进行审核、修改和删除操作，服务预约管理界面展示如图5.11所示。

![](/md/blog.024.png)

图5.11 服务预约管理界面
### 5.2.6活动管理界面
管理员和服务人员均可增删改查活动信息，活动管理界面展示如图5.12所示。

![](/md/blog.025.png)

图5.12  活动管理界面
### 5.2.7视频管理界面
管理员和服务人员均可查看、添加、修改和删除视频信息，视频管理界面展示如图5.13所示。

![](/md/blog.026.png)

图5.13 视频管理界面


第6章 系统测试










