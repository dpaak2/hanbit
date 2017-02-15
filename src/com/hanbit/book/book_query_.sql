select c.custid,c.name
from customer c , (select c.custid,
nvl(sum(b.price*o.count),0) total 
from orders o 
full outer join customer c 
on c.custid=o.custid 
full outer join book b 
on o.bookid=b.bookid
where  
c.custid is not null
group by c.custid
order by c.custid ) t1
where c.custid = t.custid and t.custid='2' and t.custid='3';
