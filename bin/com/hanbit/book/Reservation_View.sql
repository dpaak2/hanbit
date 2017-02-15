CREATE VIEW Reservation_View
AS
SELECT r.res_seq,
r.res_date,
m.multi_seq ,
t.theater_no ,
c.con_no con_no,
r.seat_no,
m.multi_name,
m.loc,
t.title,
t.price,
t.seat_count ,
c.name,
c.addr 
FROM Reservation r RIGHT OUTER JOIN Consumer c on r.con_no = c.con_no 
RIGHT OUTER JOIN Theater t ON r.theater_no = t.theater_no 
RIGHT OUTER JOIN Multiplex m ON r.multi_seq = m.multi_seq
WHERE res_seq IS NOT NULL;
SELECT * FROM Reservation_View;
