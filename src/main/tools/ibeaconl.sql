/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.6.40-log : Database - ibeacon
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ibeacon` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin */;

USE `ibeacon`;

/*Table structure for table `attraction` */

DROP TABLE IF EXISTS `attraction`;

CREATE TABLE `attraction` (
  `attractioname` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `text` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `picture` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=238 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `attraction` */

insert  into `attraction`(`attractioname`,`text`,`picture`,`id`) values ('晋祠','晋祠，原为晋王祠（唐叔虞祠），为纪念晋（汾）王及母后邑姜而兴建。位于山西太原市西南悬瓮山麓的晋水之滨。','15c02a774fce8575db464cf09dc1b4e3.jpg',223),('山西博物院','山西博物院位于太原市汾河西畔滨河西路北段13号，前身为1919年创建的山西教育图书博物馆，此后屡次更名。1953年起称山西省博物馆。新馆于2001年8月10日奠基开工，2004年竣工，定名为山西博物院，为国家“九五”重点建设工程，也是山西省建国以来投资规模最大的文化基础设施，是现代化综合性博物馆。','390405f0b8d4a3359e8f60339aab05e3.jpg',224),('太原动物园','太原动物园是城市绿地系统中以履行对野生动物实施野外救护、异地综合保护，野生动物疫情预防控制，疾病预防治疗，科学研究，对社会和公众进行野生动物科普宣传教育，动物饲养管理，繁殖展览，旅游景区公用设施，绿化养护，园容环境卫生、安全消防综合管理，服务接待职能的专类公园和生物多样性保护的示范基地，是社会公益事业的重要组成部分，也是绿化太原、美化太原、打造华夏文明看山西的一流旅游景区和建设一流省会城市的重要载体。','c02d1f0f634f3f2c8eef6b67f82360c3.jpg',225),('二龙山','二龙山景区位于山西省太原市西北角被誉为“人民兵工第一校”的中北大学校园内，是少有的和校园相依托的风景区。山势不太高，但是景色秀丽，山上鲜花遍布，景点众多，二龙山旅游风景区是太原为数不多的避暑胜地。','e1cb4826b422a458f42f6f541c6ef7b4.jpg',226),('崛围山','崛围山位于山西省太原市西北24公里尖草坪区柴村镇呼延村西，南北走向，海拔1400米左右。南有青峰，北有飞云峰。二峰高峻挺拔，夹一东西走向的深沟，隔沟对峙，势如入山门户。从山顶向下俯视，四周群山如涛似浪，宛转盘旋，形成一个巨大的旋涡，像倒立的喇叭，又如硕大的圆盘，“崛围山”之名由此而来。','50f8d220ca226d7554c8c9490d42b588.jpg',227),('但不奋斗吧','的个人呗','5ddde504-a471-4bf3-b501-e64bb3a62ef0.jpg',228),('2rfefre','gregreg','863404d7-e170-4630-a8eb-5c879e2b4e56.',229),('绵山','山西省介休市','4bd56693-dcb3-4f49-aef0-8aa1275b7005.jpg',237);

/*Table structure for table `find_people` */

DROP TABLE IF EXISTS `find_people`;

CREATE TABLE `find_people` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `text` text COLLATE utf8mb4_bin,
  `picture` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `publish_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `find_people` */

insert  into `find_people`(`id`,`title`,`text`,`picture`,`publish_time`,`end_time`,`state`,`user_id`) values (3,'找小孩','大家觉得觉得就到家','6546207d-b97a-4347-ba68-6a938c193cd7.jpg','2019-06-07 16:39:12','2019-06-08 11:35:31',1,10000),(6,'找小孩','身穿红色短袖，黄色裤子，眉毛粗粗的，脸圆圆的，叫野原新之助。','95ca8572-12c9-4cfb-9ba8-416955ddd8bf.jpg','2019-06-08 15:23:03','2019-06-08 15:24:27',1,10000),(7,'找小孩','呵呵呵呵呵呵','74bbde2b-acf3-4584-8b23-a4cb18d59f2f.jpg','2019-06-08 15:30:30',NULL,0,10000),(8,'救救孩子吧！','啊啊啊啊啊啊啊啊孩子丢啦！！！','11561dfb-a5f0-4470-a58c-48e4d0d70d6c.jpg','2019-06-10 10:18:56',NULL,0,10000),(9,'救救孩子吧！！！','孩子丢啦！！！！啊啊啊啊啊啊啊啊！！！','5114c739-d04c-4ecc-b840-ce66f51116c4.jpg','2019-06-10 11:50:28',NULL,0,10000),(10,'救救孩子吧啊啊啊啊啊啊啊啊','啊啊啊啊啊啊啊啊孩子丢啦！！！','b4bbcdbc-88fc-4ce3-922f-d7a4f2b595e7.jpg','2019-06-10 11:54:44',NULL,0,10000),(11,'我妈妈走丢了','我妈妈走丢了，请好心人找找她，谢谢','f5e7932b-57f9-4576-b547-76004b379c87.jpg','2019-06-10 12:05:43','2019-06-10 12:06:04',1,10000);

/*Table structure for table `hotel` */

DROP TABLE IF EXISTS `hotel`;

CREATE TABLE `hotel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `text` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `picture` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `hotel` */

insert  into `hotel`(`id`,`type`,`text`,`picture`,`price`,`name`) values (1,'高档型','杏花岭区府东街87号','758de2bcd3c028217b5064a7c8824872.jpg','1000','太原铜锣湾广场和颐酒店'),(2,'三星级','桃园正街6号','87ccec81453f0f96c5121bfe34235541.jpg','800','山西农业大厦绿色主题酒店'),(3,'经济型','朝阳街2号，地处服装城','d2e69e8569e21cbe8330c74cb0fff2d7.jpg','900','7天连锁酒店(太原火车站店)'),(4,'豪华型','迎泽大街118号','4eb629066f37472ca2c85a6796f421fa.jpg','1500','太原并州饭店'),(5,'豪华型','小店区长风街115-1号','b11117e92091349e7574c67a662a8045.jpg','1200','太原凯宾斯基饭店');

/*Table structure for table `restaurant` */

DROP TABLE IF EXISTS `restaurant`;

CREATE TABLE `restaurant` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `foodname` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `picture` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `text` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `restaurant` */

insert  into `restaurant`(`id`,`name`,`foodname`,`picture`,`price`,`text`) values (1,'山西会馆(太原胜利东街店)','中餐, 亚洲料理 晚餐 预订, 服务员, 座位','bfd11f3a09c06ab70f963b3a14a6ff98.jpg','10','山西省太原市胜利东街甲3号'),(2,'河东颐祥阁','中餐','fcd241c5c3d647bd92c4d52b2ddeeae6.jpg','20','山西省太原市亲贤北街10号'),(3,'上品牛排','牛排馆','fcd241c5c3d647bd92c4d52b2ddeeae6.jpg','30','山西省太原市小店区长风街116号北美新天地5楼'),(4,'清和元饭店(并南店)','美式烹饪','d65014adc7241803235842448100b598.jpg','40','山西省太原市并州南路102号'),(5,'晋韵贵宾楼','中餐','e762a0f13a0615b950eb0bbe0c75c87b.jpg',NULL,'山西省太原市小店区长风街体育西路');

/*Table structure for table `store` */

DROP TABLE IF EXISTS `store`;

CREATE TABLE `store` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `text` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `picture` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `storename` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `store` */

insert  into `store`(`id`,`name`,`text`,`picture`,`price`,`storename`) values (1,'牛肉干','百草味 原切牛肉条50g/袋 肉干肉脯休闲零食特产美食小吃','5b50404fN21f72dc1.jpg','18','百草味自营店'),(2,'龙须酥','西安回民街小吃龙须酥糖糕点小吃零食地方特色美食','58e09337Naeb38c97.jpg','26','秦品轩食品店'),(3,'梅干菜','休闲小吃梅干菜特产零食点心美食 ','5af3e11aNf35942cd.jpg','24','百草味自营店');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`) values (1,'dingding','123456');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
