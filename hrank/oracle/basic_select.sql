/*https://www.hackerrank.com/challenges/revising-the-select-query/*/
select * from city where countrycode = 'USA' and population > 100000;

/*https://www.hackerrank.com/challenges/revising-the-select-query-2/*/
select name from city where countrycode = 'USA' and population > 120000;

/*https://www.hackerrank.com/challenges/select-all-sql/*/
select * from city;

/*https://www.hackerrank.com/challenges/select-by-id/*/
select * from CITY where ID = 1661;

/*https://www.hackerrank.com/challenges/japanese-cities-attributes/*/
select * from CITY where countrycode = 'JPN';

/*https://www.hackerrank.com/challenges/japanese-cities-name/*/
select c.name from city c where countrycode = 'JPN';

/*https://www.hackerrank.com/challenges/weather-observation-station-1/*/
select s.city, s.state from station s;

/*https://www.hackerrank.com/challenges/weather-observation-station-3/*/
select distinct city from station where mod(id, 2) = 0;

/*https://www.hackerrank.com/challenges/weather-observation-station-4/*/
select count(city)-count(distinct city) from station;

/*https://www.hackerrank.com/challenges/weather-observation-station-5/*/
select * from (select city, length(city) from station order by length(city), city) where rownum = 1;
select * from (select city, length(city) from station order by length(city) desc, city) where rownum = 1;

/*https://www.hackerrank.com/challenges/weather-observation-station-6/*/
select distinct city from station where regexp_like(lower(city), '^[aeiou]');

/*https://www.hackerrank.com/challenges/weather-observation-station-7/*/
select distinct city from station where regexp_like(lower(city), '[aeiou]$');

/*https://www.hackerrank.com/challenges/weather-observation-station-7/*/
select distinct city from station where regexp_like(lower(city), '[aeiou]$');

/*https://www.hackerrank.com/challenges/weather-observation-station-8/*/
select distinct city from station where regexp_like(lower(city), '^[aeiou].*[aeiou]$');

/*https://www.hackerrank.com/challenges/weather-observation-station-9/*/
select distinct city from station where not regexp_like(lower(city), '^[aeiou]');

/*https://www.hackerrank.com/challenges/weather-observation-station-10/*/
select distinct city from station where not regexp_like(lower(city), '[aeiou]$');

/*https://www.hackerrank.com/challenges/weather-observation-station-11/*/
select distinct city from station where not regexp_like(lower(city), '^[aeiou].*[aeiou]$');

/*https://www.hackerrank.com/challenges/weather-observation-station-12/*/
select distinct city from station where not regexp_like(lower(city), '^[aeiou]') and not regexp_like(lower(city), '*[aeiou]$');

/*https://www.hackerrank.com/challenges/more-than-75-marks/*/
select name from students where marks > 75 order by substr(name, -3), id;

/*https://www.hackerrank.com/challenges/name-of-employees/*/
select name from employee order by name;

/*https://www.hackerrank.com/challenges/salary-of-employees/*/
select name from employee where salary > 2000 and months < 10 order by employee_id;