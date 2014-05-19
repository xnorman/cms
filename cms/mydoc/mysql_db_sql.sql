use cms_demo;

CREATE TABLE IF NOT EXISTS `cms_demo`.`cms_category` (
  `category_id` INT NOT NULL AUTO_INCREMENT,
  `category_name` VARCHAR(100) NULL,
  `category_flag` INT NULL DEFAULT 0,
  `category_level` INT NULL DEFAULT 0,
  `category_father_id` INT NULL,
  `category_date` DATETIME NULL,
  PRIMARY KEY (`category_id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `cms_demo`.`cms_content` (
  `content_id` INT NOT NULL AUTO_INCREMENT,
  `content_intro` VARCHAR(500) NULL,
  `content_author` INT NULL,
  `content_date` DATETIME NULL,
  `content_tag` VARCHAR(100) NULL,
  `content_text` TEXT NULL,
  `content_visitcount` INT NULL,
  `content_flag` INT NULL DEFAULT 0,
  `content_category` INT NULL,
  PRIMARY KEY (`content_id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `cms_demo`.`cms_customer` (
  `customer_id` INT NOT NULL AUTO_INCREMENT,
  `customer_name` VARCHAR(100) NOT NULL,
  `customer_sex` INT NULL,
  `customer_email` VARCHAR(200) NOT NULL,
  `customer_date` DATETIME NULL,
  `customer_level` INT NULL DEFAULT 1,
  `customer_flag` INT NULL DEFAULT 0,
  `customer_pwd` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`customer_id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `cms_demo`.`common_ip` (
  `ip` INT NOT NULL,
  `country` VARCHAR(45) NULL,
  `country_id` VARCHAR(45) NULL,
  `area` VARCHAR(45) NULL,
  `area_id` VARCHAR(45) NULL,
  `region` VARCHAR(45) NULL,
  `region_id` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `city_id` VARCHAR(45) NULL,
  `county` VARCHAR(45) NULL,
  `county_id` VARCHAR(45) NULL,
  `isp` VARCHAR(45) NULL,
  `isp_id` VARCHAR(45) NULL,
  PRIMARY KEY (`ip`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `cms_demo`.`common_visit` (
  `visit_id` INT NOT NULL AUTO_INCREMENT,
  `visit_date` DATETIME NULL,
  `visit_ip` VARCHAR(20) NULL COMMENT '	',
  `visit_browser` VARCHAR(45) NULL,
  `visit_os` VARCHAR(45) NULL,
  `visit_flag` INT NULL DEFAULT 0,
  `visit_content` VARCHAR(200) NULL,
  `visit_url` VARCHAR(200) NULL,
  `visit_user` INT NULL,
  PRIMARY KEY (`visit_id`))
ENGINE = InnoDB;