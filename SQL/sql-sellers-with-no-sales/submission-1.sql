select seller_name 
from seller 
where seller_id not in (
    select seller_id from orders
    where sale_date>='2020-01-01' and sale_date<='2020-12-31'
)
order by seller_name asc;

