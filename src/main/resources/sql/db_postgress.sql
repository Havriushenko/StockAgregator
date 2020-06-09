CREATE TABLE if not exists quote (
id SERIAL NOT NULL,
symbol VARCHAR(100) NOT NULL unique,
company_name VARCHAR(200) NOT NULL,
calculation_price VARCHAR(200),
open DECIMAL,
open_time BIGINT,
open_source VARCHAR(200),
close VARCHAR(200),
close_time DECIMAL,
close_source VARCHAR(200),
high DECIMAL,
high_time BIGINT,
high_source VARCHAR(500),
low DECIMAL,
low_time BIGINT,
low_source VARCHAR(500),
latest_price INT,
latest_source VARCHAR(100),
latest_time VARCHAR(200),
latest_update BIGINT,
latest_volume INT,
iex_realtime_price VARCHAR(200),
iex_realtime_size VARCHAR(200),
iex_last_updated VARCHAR(200),
primary_exchange VARCHAR(200),
delayed_price DECIMAL,
delayed_price_time BIGINT,
odd_lot_delayed_price DECIMAL,
odd_lot_delayed_price_time BIGINT,
extended_price DECIMAL,
extended_change INT,
extended_change_percent INT,
extended_price_time BIGINT,
previous_close DECIMAL,
previous_volume INT,
change DECIMAL,
change_percent DECIMAL,
volume INT,
iex_market_percent DECIMAL,
iex_volume DECIMAL,
avg_total_volume INT,
iex_bid_price DECIMAL,
iex_bid_size DECIMAL,
iex_ask_price DECIMAL,
iex_ask_size DECIMAL,
iex_open DECIMAL,
iex_open_time DECIMAL,
iex_close DECIMAL,
iex_close_time BIGINT,
market_cap BIGINT,
pe_ratio DECIMAL,
week52_high DECIMAL,
week52_low DECIMAL,
ytd_change DECIMAL,
last_trade_time DECIMAL,
is_us_market_open BOOLEAN,
PRIMARY KEY (id));

CREATE TABLE if not exists history (
id SERIAL NOT NULL,
id_company INT NOT NULL,
field_name VARCHAR(200) NOT NULL,
last_change VARCHAR(500) NOT NULL,
new_change VARCHAR(500) NOT NULL,
PRIMARY KEY (id));