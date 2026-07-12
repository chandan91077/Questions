# Write your MySQL query statement below
select e1.name from employee e1
join employee e2
where e1.id=e2.managerid
group by e1.name,e1.id
having count(e2.id)>=5;