use uacity;
CREATE TABLE `menu` (
  `id` bigint(20) NOT NULL auto_increment,
  `name` varchar(255) NOT NULL default '',
  `url` varchar(255) default '',
  `parentId` bigint(20) NOT NULL default '-1',
  `sort` int(11) default '0',
  PRIMARY KEY  (`id`),
  UNIQUE KEY `unique` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `menu_role` (
  `menu_id` bigint(20) NOT NULL default '0',
  `role_id` bigint(20) NOT NULL default '0',
  UNIQUE KEY `unique` (`menu_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `resource` (
  `id` bigint(20) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `resource_type` varchar(255) default NULL,
  `resource_string` varchar(255) default NULL,
  `priority` int(11) default NULL,
  `description` varchar(255) default NULL,
  PRIMARY KEY  (`id`),
  UNIQUE KEY `unique` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `resource_role` (
  `resource_id` bigint(20) NOT NULL default '0',
  `role_id` bigint(20) NOT NULL default '0',
  UNIQUE KEY `unique` (`resource_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `user_role` (
  `user_id` bigint(20) NOT NULL default '0',
  `role_id` bigint(20) NOT NULL default '0',
  UNIQUE KEY `unique` (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `role` (
  `id` bigint(20) NOT NULL auto_increment,
  `name` varchar(255) NOT NULL default '',
  `description` varchar(255) NOT NULL default '',
  PRIMARY KEY  (`id`),
  UNIQUE KEY `unique` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `user` (
  `id` bigint(20) NOT NULL auto_increment,
  `username` varchar(255) NOT NULL default '',
  `password` varchar(255) NOT NULL default '',
  `status` tinyint(1) NOT NULL default '1',
  `descn` varchar(255) NOT NULL default '',
  PRIMARY KEY  (`id`),
  UNIQUE KEY `unique` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `user_role` (
  `user_id` bigint(20) NOT NULL default '0',
  `role_id` bigint(20) NOT NULL default '0',
  UNIQUE KEY `unique` (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
