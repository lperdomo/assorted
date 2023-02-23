/*https://www.hackerrank.com/challenges/revising-aggregations-the-count-function/*/
select count(*) from city where population > 100000;

/*https://www.hackerrank.com/challenges/revising-aggregations-sum/*/
select sum(population) from city where district = 'California';

/*https://www.hackerrank.com/challenges/revising-aggregations-the-average-function/*/
select avg(population) from city where district = 'California';

/*https://www.hackerrank.com/challenges/average-population/*/
select floor(avg(population)) from city;

/*https://www.hackerrank.com/challenges/japan-population/*/
select sum(population) from city where countrycode = 'JPN';

/*https://www.hackerrank.com/challenges/population-density-difference/*/
select max(population)-min(population) from city;

/*https://www.hackerrank.com/challenges/the-blunder/*/
select ceil(avg(salary) - avg(replace(salary, '0', ''))) from employees;

/*https://www.hackerrank.com/challenges/earnings-of-employees/*/
select * from (select salary*months, count(*) from employee group by salary*months order by salary*months desc) where rownum = 1;

/*https://www.hackerrank.com/challenges/weather-observation-station-2/*/
select round(sum(lat_n), 2), round(sum(long_w), 2) from station;

/*https://www.hackerrank.com/challenges/weather-observation-station-13/*/
select round(sum(lat_n), 4) from station where lat_n > 38.7880 and lat_n < 137.2345;

/*https://www.hackerrank.com/challenges/weather-observation-station-14/*/
select round(max(lat_n), 4) from station where lat_n < 137.2345;

/*https://www.hackerrank.com/challenges/weather-observation-station-15/*/
select round(long_w, 4) from (select * from station where lat_n < 137.2345 order by lat_n desc) where rownum = 1;

/*https://www.hackerrank.com/challenges/weather-observation-station-16/*/
select round(min(lat_n), 4) from station where lat_n > 38.7780;

/*https://www.hackerrank.com/challenges/weather-observation-station-17/*/
select round(long_w, 4) from (select * from station where lat_n > 38.7780 order by lat_n asc) where rownum = 1;

/*https://www.hackerrank.com/challenges/weather-observation-station-18/*/
select round(abs(min(lat_n) - max(lat_n)) + abs(min(long_w) - max(long_w)), 4) from station;

/*https://www.hackerrank.com/challenges/weather-observation-station-19/*/
select round(sqrt(power(max(lat_n) - min(lat_n), 2) + power(max(long_w) - min(long_w), 2)), 4) from station;

/*https://www.hackerrank.com/challenges/weather-observation-station-20/*/
select round(median(lat_n), 4) from station;