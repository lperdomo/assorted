/*https://www.hackerrank.com/challenges/sql-projects/*/
select start_date, min(end_date)
from (select start_date from projects where start_date not in (select end_date from projects)), 
(select end_date from projects where end_date not in (select start_date from projects))
where start_date < end_date
group by start_date
order by (min(end_date) - start_date), start_date;

/*https://www.hackerrank.com/challenges/placements/*/
select s1.name from students s1
inner join packages p1 on s1.id = p1.id
inner join friends f on s1.id = f.id
inner join students s2 on f.friend_id = s2.id
inner join packages p2 on s2.id = p2.id
where p1.salary < p2.salary
order by p2.salary;

/*https://www.hackerrank.com/challenges/symmetric-pairs/*/
select a.x, a.y from functions a
inner join functions b on a.x = b.y and a.y = b.x
group by a.x, a.y
having count(a.x) > 1 or a.x < a.y
order by a.x;