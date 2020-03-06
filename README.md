# 上一套框架用的SSM 配置过于麻烦。
# 现在重新起了一套SpringBoot框架

## 每套框架我都给他起了一个名字（这次的叫做黑科MES，代表黑马、黑科技）

## 界面展示
![](https://s2.ax1x.com/2020/03/06/3b89zD.gif)


### 登录界面 含粒子特效
![1](https://s2.ax1x.com/2020/03/06/3bQLqI.png)

### 主菜单界面
![1](https://s2.ax1x.com/2020/03/06/3bQqsA.png)

### 功能界面
![1](https://s2.ax1x.com/2020/03/06/3bQbMd.png)
### 技术架构

springBoot+mybatis-plus+redis+shiro+hutool+layuimini+jenkins

实现功能：

1. 用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2. 主数据管理：动态配置表以及所需要显示的字段，只需要简单维护既可以完成增删改成操作。
3. 赋码管理：动态配置码规则项。例如6位年月日 3位，流水号，随机号。根据用户配置自动创建SN。
4. 菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5. 角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6. 字典管理：对系统中经常使用的一些较为固定的数据进行维护，如：是否、男女、类别、级别等。
7. 物料进出管理：包含物料叫料，配料，发料，确认收料，上料
8. 工单管理：工单下达，工单分解，工单状态调整，工单特殊设置
9. 在制品管理：过站工序记录，数据绑定成箱成剁
10. 质量管理： 质检项维护，根据物料或者型号管理质检项目。检验页面，抽检确认
11. 工艺文件管理 ：工艺参数，BOM文件，导入导出
12. 报表：图形化展示
13. 设备管理： 设备信息录入，使用记录，设备台账，设备维保
14. 操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
15. 连接池监视：监视当期系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。
16. 工作流引擎：实现业务工单流转、在线流程设计器。

#### 使用注意事项

* 前端
    * 日期工具库：static/lib/dayjs.min.js
    * Javascript 工具库：static/lib/lodash.min.js
    * Layui 树形表格插件
        * https://gitee.com/whvse/treetable-lay

    * 图标库使用
        * http://www.fontawesome.com.cn/faicons/
    * 阿里矢量图标
        * https://www.iconfont.cn/  
* 后端
    * Hutool 是一个小而全的Java工具类库，通过静态方法封装，降低相关API的学习成本，提高工作效率，使Java拥有函数式语言般的优雅，让Java语言也可以“甜甜的”。



# 总结
Q群87652870 欢迎想一起开发的小伙伴。。本人前端太弱，都是自己乱摸索。还请有一个前端选手能一起弄
