/********************************************/
/*Internet Market DB creation script for PostgreSQL*/
/******************************************/
DROP database if exists stock_agregator;
CREATE DATABASE if not exists stock_agregator CHARACTER SET UTF8 COLLATE utf8_unicode_ci;

use stock_agregator;

/*****************************/
/*Creates the table of Company */
/*****************************/
CREATE TABLE if not exists `Company` (
`id` INT NOT NULL auto_increment,
`symbol` VARCHAR(100) NOT NULL unique,
`companyName` VARCHAR(200) NOT NULL,
`calculationPrice` VARCHAR(200),
`open` DOUBLE,
`openTime` BIGINT,
`openSource` VARCHAR(200),
`close` DOUBLE,
`closeTime` DOUBLE,
`closeSource` VARCHAR(200),
`high` DOUBLE,
`highTime` BIGINT,
`highSource` VARCHAR(500),
`low` DOUBLE,
`lowTime` BIGINT,
`lowSource` VARCHAR(500),
`latestPrice` INT,
`latestSource` VARCHAR(100),
`latestTime` VARCHAR(200),
`latestUpdate` BIGINT,
`latestVolume` INT,
`iexRealtimePrice` VARCHAR(200),
`iexRealtimeSize` VARCHAR(200),
`iexLastUpdated` VARCHAR(200),
`primaryExchange` VARCHAR(200),
`delayedPrice` decimal,
`delayedPriceTime` BIGINT,
`oddLotDelayedPrice` decimal,
`oddLotDelayedPriceTime` BIGINT,
`extendedPrice` decimal,
`extendedChange` INT,
`extendedChangePercent` INT,
`extendedPriceTime` BIGINT,
`previousClose` decimal,
`previousVolume` INT,
`change` decimal,
`changePercent` decimal,
`volume` INT,
`iexMarketPercent` decimal,
`iexVolume` decimal,
`avgTotalVolume` INT,
`iexBidPrice` decimal,
`iexBidSize` decimal,
`iexAskPrice` decimal,
`iexAskSize` decimal,
`iexOpen` decimal,
`iexOpenTime` decimal,
`iexClose` decimal,
`iexCloseTime` BIGINT,
`marketCap` BIGINT,
`peRatio` decimal,
`week52High` decimal,
`week52Low` decimal,
`ytdChange` decimal,
`lastTradeTime` decimal,
`isUSMarketOpen` BOOLEAN,
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
