# myblog

这是一个亲自动手从0开发的基于springboot的项目，里面会集成企业中用到的主流框架，特此记录一下其中用到的知识和对这些框架的学习，方便日后使用与开发。

----------
1. mybatis plus：是一个MyBatis的增强工具，在MyBatis的基础上只做增强不做改变，为简化开发、提高效率而生。开发人员可以不用写SQL语句就能操作数据库，其内部自动帮我们集成了基本的CRUD、分页、事务管理等功能，对于一些自定义的SQL语句用户也可以自己设计，当然这里面最实际的是一个代码生成器，开发人员只需要设计好数据库之后，使用其提供的代码生成器就可以自动生成pojo、mapper、service、controller等代码，开发人员只需要关注业务即可。其中文学习网址在[这里](https://mp.baomidou.com/guide/#%E7%89%B9%E6%80%A7 "mybatis plus")
2. lombok：lombok是一个可以通过简单的注解的形式来帮助我们简化消除一些必须有但显得很臃肿的Java代码的工具，目的也是为了简化开发，但是确实是非常好用的一个工具，不用要提前在idea中安装lombok的插件，安装方法在[这里](https://jingyan.baidu.com/article/0a52e3f4e53ca1bf63ed725c.html)，在使用的时候可以查[官方文档](https://projectlombok.org/features/all)。
3. freemaker：freemaker是一个模板的引擎，和themleaf一样更适合MVC的模型，页面中可以直接访问后台传来的参数，开发更加方便，详细的使用可以去参考[中文社区](http://www.freemarker.cn/)。
4. layui社区模板：该社区提供了大量的网页开发模板和实用的插件，拿来即用即可，也可作为参考，[社区地址](https://www.layui.com/)。

