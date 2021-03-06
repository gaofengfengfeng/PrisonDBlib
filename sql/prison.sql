CREATE TABLE `prisoner` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `prisonerId` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '罪犯id',

  `prisonerCodeNum` varchar(32) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '狱政编号',
  `password` varchar(256) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '密码',
  `salt` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '盐',
  `portraitUrl` varchar(256) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '头像url地址',

  `prisonAddress` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '监狱地址',
  `prisonArea` varchar(16) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '监区',
  `criminalType` smallint(4) NOT NULL DEFAULT '0' COMMENT '犯罪类型',
  `prisonTerm` varchar(16) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '刑期',

  `prisonerName` varchar(16) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '姓名',
  `idCardNo` varchar(32) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '身份证号码',
  `gender` smallint(4) NOT NULL DEFAULT '0' COMMENT '性别',
  `age` smallint(4) NOT NULL DEFAULT '0' COMMENT '年龄',
  `birthDate` varchar(32) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '出生日期(年月日)',
  `homeAddress` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '家庭地址',

  `roleId` smallint(4) NOT NULL DEFAULT '0' COMMENT '角色id',
  `score` bigint(11) NOT NULL DEFAULT '0' COMMENT '阳光积分',
  `privilegeLevel` smallint(4) NOT NULL DEFAULT '0' COMMENT '权限等级',

  `beginTime` bigint(20) NOT NULL DEFAULT '0' COMMENT '入狱时间',
  `registerTime` bigint(20) NOT NULL DEFAULT '0' COMMENT '注册时间',
  `createTime` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建时间',
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_idCard_no` (`idCardNo`),
  UNIQUE KEY `uniq_prisoner_id` (`prisonerId`),
  UNIQUE KEY `uniq_prisoner_code_num` (`prisonerCodeNum`),
  KEY `idx_idCard_no` (`idCardNo`),
  KEY `idx_prisoner_id` (`prisonerId`),
  KEY `idx_prisoner_code_num` (`prisonerCodeNum`)
)ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='犯人用户信息表';

CREATE TABLE `prisoner_family`(
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `prisonerFamilyId` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '犯属id',
  `username` varchar(32) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(256) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '密码',
  `salt` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '盐',
  `portraitUrl` varchar(256) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '头像url地址',
  `prisonerFamilyName`  varchar(16) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '犯属姓名',
  `idCardNo` varchar(32) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '身份证号码',
  `gender` smallint(4) NOT NULL DEFAULT '0' COMMENT '性别',
  `phone` varchar(16) NOT NULL DEFAULT '' COMMENT '手机号',
  `homeAddress` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '家庭地址',
  `educationDegree` varchar(16) NOT NULL DEFAULT '' COMMENT '文化程度',
  `roleId` smallint(4) NOT NULL DEFAULT '0' COMMENT '角色id',
  `createTime` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建时间',
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_idCard_no` (`idCardNo`),
  UNIQUE KEY `uniq_prisoner_family_id` (`prisonerFamilyId`),
  UNIQUE KEY `uniq_username` (`username`),
  UNIQUE KEY `uniq_phone` (`phone`),
  KEY `idx_idCard_no` (`idCardNo`),
  KEY `idx_prisoner_family_id` (`prisonerFamilyId`),
  KEY `idx_username` (`username`),
  KEY `idx_phone` (`phone`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='犯人家属用户信息表';

CREATE TABLE `prisoner_family_relationship`(
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `prisonerId` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '罪犯id',
  `prisonerFamilyId` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '犯属id',
  `relationship` varchar(16) NOT NULL DEFAULT '' COMMENT '犯人犯属关系',
  `createTime` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建时间',
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE
  CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `idx_prisoner_id` (`prisonerId`),
  KEY `idx_prisoner_family_id` (`prisonerFamilyId`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='犯人犯属关系表';