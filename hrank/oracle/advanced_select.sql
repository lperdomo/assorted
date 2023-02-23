/*https://www.hackerrank.com/challenges/what-type-of-triangle/*/
select case when not (a + b > c and b + c > a and a + c > b) then 'Not A Triangle'
            when a = b and b = c then 'Equilateral'
            when a = b or b = c or a = c then 'Isosceles'
            else 'Scalene' end case
            from triangles;
			
/*https://www.hackerrank.com/challenges/the-pads/*/
select concat(concat(concat(name, '('), substr(occupation, 1, 1)), ')') from occupations order by name;
select concat(concat(concat(concat('There are a total of ', count(occupation)), ' '), lower(occupation)), 's.') from occupations
group by occupation order by count(occupation), occupation;

/*https://www.hackerrank.com/challenges/occupations/*/
select doctor, professor, singer, actor
from (select row_number() over (partition by occupation order by name) as n, name, occupation from occupations)
pivot(max(name) for occupation in ('Doctor' as doctor, 'Professor' as professor,
                                   'Singer' as singer, 'Actor' as actor))
order by n;

/*https://www.hackerrank.com/challenges/binary-search-tree-1/*/
select N, (case when P is NULL then 'Root' 
           else (case when (select count(*) from BST where P = b.N) > 0 then 'Inner' 
                 else 'Leaf' end) 
           end) from BST b 
order by N;

/*https://www.hackerrank.com/challenges/the-company/*/
select c.company_code, c.founder, count(distinct lm.lead_manager_code), count(distinct sm.senior_manager_code), count(distinct m.manager_code), count(distinct e.employee_code) from company c 
inner join lead_manager lm on c.company_code = lm.company_code
inner join senior_manager sm on lm.lead_manager_code = sm.lead_manager_code
inner join manager m on sm.senior_manager_code = m.senior_manager_code
inner join employee e on m.manager_code = e.manager_code
group by c.company_code, c.founder
order by c.company_code asc;