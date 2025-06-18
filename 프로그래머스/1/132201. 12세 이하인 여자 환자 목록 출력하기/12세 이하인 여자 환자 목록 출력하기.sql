-- 코드를 입력하세요
# select * from patient;
# DELETE FROM PATIENT WHERE pt_name = '스티치';
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(tlno,'NONE') AS TLNO
FROM PATIENT
WHERE gend_cd = 'w' AND age <= 12
ORDER BY age DESC, PT_NAME ASC;