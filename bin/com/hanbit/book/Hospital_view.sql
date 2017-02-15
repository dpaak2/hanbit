CREATE VIEW Hospital_view
AS
SELECT
     c.chart_id chart_id,
     c.treat_id treat_id,
     c.doc_id doc_id,
     c.pat_id pat_id,
     c.nur_id nur_id,
     c.chart_contents chart_contents,
     d.doc_name doc_name,
     d.major_treat major_treat,
     d.doc_gen doc_gen,
     d.doc_phone doc_phone,
     d.doc_email doc_email,
     d.doc_position doc_position,
     n.nur_name nur_name,
     n.major_job major_job,
     n.nur_gen nur_gen,
     n.nur_phone nur_phone,
     n.nur_email nur_email,
     n.nur_position nur_position,
     p.pat_name pat_name,
     p.pat_gen pat_gen,
     p.pat_jumin pat_jumin,
     p.pat_addr pat_addr,
     p.pat_phone pat_phone,
     p.pat_email pat_email,
     p.pat_job pat_job,
     t.treat_contents treat_contents,
     t.treat_date treat_date  
FROM Charts c
FULL OUTER JOIN Doctors d
ON c.doc_id = d.doc_id
FULL OUTER JOIN Nurses n
ON c.nur_id = n.nur_id
FULL OUTER JOIN Patients p
ON c.pat_id = p.pat_id
FULL OUTER JOIN Treatment t
ON c.treat_id = t.treat_id
WHERE chart_id IS NOT NULL;
--SELECT * FROM Hospital_view;