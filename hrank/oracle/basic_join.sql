/*https://www.hackerrank.com/challenges/asian-population/*/
select sum(ci.population) from city ci, country co where ci.countrycode = co.code and co.continent = 'Asia';

/*https://www.hackerrank.com/challenges/african-cities/*/
select ci.name from city ci, country co where ci.countrycode = co.code and co.continent = 'Africa';

/*https://www.hackerrank.com/challenges/average-population-of-each-continent/*/
select co.continent, floor(avg(ci.population)) from city ci, country co where ci.countrycode = co.code group by co.continent;

/*https://www.hackerrank.com/challenges/the-report/*/
select case when g.grade < 8 then 'NULL' else s.name end case, g.grade, s.marks from students s, grades g where s.marks >= g.min_mark and s.marks <= g.max_mark order by g.grade desc, s.name;

/*https://www.hackerrank.com/challenges/full-score/*/
select h.hacker_id, h.name from hackers h
inner join submissions s on h.hacker_id = s.hacker_id
inner join challenges c on s.challenge_id = c.challenge_id
inner join difficulty d on c.difficulty_level = d.difficulty_level
where s.score = d.score group by h.hacker_id, h.name
having count(h.hacker_id) > 1 order by count(h.hacker_id) desc, h.hacker_id asc;

/*https://www.hackerrank.com/challenges/harry-potter-and-wands/*/
select w.id, wp.age, w.coins_needed, w.power from wands w 
inner join wands_property wp on w.code = wp.code
where wp.is_evil = 0 
and coins_needed = (select min(coins_needed) from wands x
                    inner join wands_property y on x.code = y.code
                    where x.power = w.power and y.age = wp.age)
order by w.power desc, wp.age desc;

/*https://www.hackerrank.com/challenges/challenges/*/
select h.hacker_id, h.name, count(c.challenge_id) 
from hackers h inner join challenges c on h.hacker_id = c.hacker_id
group by h.hacker_id, h.name
having count(c.challenge_id) = (select * from (select count(c2.challenge_id) from challenges c2
                                               group by c2.hacker_id
                                               order by count(c2.challenge_id) desc)
                                               where rownum = 1) 
or count(c.challenge_id) in (select distinct counts 
                             from (select h2.hacker_id,  h2.name, count(challenge_id) as counts 
                                   from hackers h2 inner join challenges c on c.hacker_id = h2.hacker_id
                                   group by h2.hacker_id, h2.name)
                             group by counts
                             having count(counts) = 1)
order by count(c.challenge_id) desc, h.hacker_id;

/*https://www.hackerrank.com/challenges/contest-leaderboard/*/
select x.hacker_id, x.name, sum(x.score) from (select h.hacker_id, h.name, max(s.score) score from submissions s
                                                inner join hackers h on s.hacker_id = h.hacker_id 
                                                group by h.hacker_id, h.name, s.challenge_id) x
group by x.hacker_id, x.name
having sum(x.score) > 0
order by sum(x.score) desc, x.hacker_id;