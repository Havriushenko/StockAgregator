/********************************************/
/*Internet Market DB creation script for PostgreSQL*/
/******************************************/
DROP database if exists stock_agregator;
CREATE DATABASE if not exists stock_agregator CHARACTER SET UTF8 COLLATE utf8_unicode_ci;

use stock_agregator;

/*****************************/
/*Creates the table of Company */
/*****************************/
CREATE TABLE if not exists `quote` (
`id` INT NOT NULL auto_increment,
`symbol` VARCHAR(100) NOT NULL unique,
`company_name` VARCHAR(200) NOT NULL,
`calculation_price` VARCHAR(200),
`open` DOUBLE(10,2),
`open_time` BIGINT,
`open_source` VARCHAR(200),
`close` DOUBLE(10,2),
`close_time` DOUBLE(10,2),
`close_source` VARCHAR(200),
`high` DOUBLE(10,2),
`high_time` BIGINT,
`high_source` VARCHAR(500),
`low` DOUBLE(10,2),
`low_time` BIGINT,
`low_source` VARCHAR(500),
`latest_price` INT,
`latest_source` VARCHAR(100),
`latest_time` VARCHAR(200),
`latest_update` BIGINT,
`latest_volume` INT,
`iex_realtime_price` VARCHAR(200),
`iex_realtime_size` VARCHAR(200),
`iex_last_updated` VARCHAR(200),
`primary_exchange` VARCHAR(200),
`delayed_price` double(10,2),
`delayed_price_time` BIGINT,
`odd_lot_delayed_price` double(10,2),
`odd_lot_delayed_price_time` BIGINT,
`extended_price` double(10,2),
`extended_change` INT,
`extended_change_percent` INT,
`extended_price_time` BIGINT,
`previous_close` double(10,2),
`previous_volume` INT,
`change` double(10,2),
`change_percent` double(10,2),
`volume` INT,
`iex_market_percent` double(10,2),
`iex_volume` double(10,2),
`avg_total_volume` INT,
`iex_bid_price` double(10,2),
`iex_bid_size` double(10,2),
`iex_ask_price` double(10,2),
`iex_ask_size` double(10,2),
`iex_open` double(10,2),
`iex_open_time` double(10,2),
`iex_close` double(10,2),
`iex_close_time` BIGINT,
`market_cap` BIGINT,
`pe_ratio` double(10,2),
`week52_high` double(10,2),
`week52_low` double(10,2),
`ytd_change` double(10,2),
`last_trade_time` double(10,2),
`is_us_market_open` BOOLEAN,
PRIMARY KEY (`id`));

/*****************************/
/*Creates the table of History */
/*****************************/
CREATE TABLE if not exists `history` (
`id` INT NOT NULL auto_increment,
`id_company` INT NOT NULL,
`field_name` VARCHAR(200) NOT NULL,
`last_change` VARCHAR(500) NOT NULL,
`new_change` VARCHAR(500) NOT NULL,
PRIMARY KEY (`id`));
