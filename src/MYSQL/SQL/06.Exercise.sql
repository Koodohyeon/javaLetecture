# 1. 2009년도에 데뷔한 걸그룹의 히트송은?

# 걸그룹이름, 데뷔일자, 히트송 제목


select r.name, r.debut, l.lyrics from girl_group r 

inner join song l

on l.sid=r.hit_song_id

where debut between '2009-01-01' and '2009-12-31';

​

​

#2. 데뷔일자가 빠른 5개의 그룹의 히트송은?

# 걸그룹이름, 데뷔일자, 히트송 제목

​

select r.name, r.debut, l.lyrics from girl_group r 

inner join song l

on l.sid=r.hit_song_id

limit 5;

​

# 3. 대륙별로 국가숫자, GNP의 합, 평균 국가별 GNP는?

select continent 대륙명, count(*) 국가수, sum(gnp) GNP합, ROUND(avg(GNP)) GNP평균 from country

group by continent;

​

# 4. 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 보여줄 것

# 대륙명, 국가명, 도시명, 인구수

​

SELECT Continent, r.Name countryName, l.Name cityName, l.Population FROM city l

JOIN country r

ON l.CountryCode=r.Code

WHERE Continent='Asia'

ORDER BY l.Population DESC

LIMIT 10;

​

#5. 전 세계에서 GNP가 높은 10개 국가에서 사용하는 공식언어는?

# 국가명, GNP, 언어명

​

SELECT l.Name 국가명, l.gnp GNP, r.`Language` 언어명 FROM country l

JOIN countrylanguage r ON l.Code=r.countrycode

WHERE r.IsOfficial='T'

ORDER BY l.gnp DESC

LIMIT 10;