-- Q7 where hashtag = "GOP", state = "NC", month = 10, year = 2016, k = 5
select distinct count(twt.tid), twitter_user.screen_name, twitter_user.category
from twitter_user
join tweet as twt on twt.posting_user = twitter_user.screen_name
join tweet_tag as tag on tag.tid = twt.tid
where tag.tag_name = "GOPDebate"
and twitter_user.state = "NC"
and month(twt.posted) = 10
and month(twt.posted) = 2016
limit 5;

-- Q16 where k = 5, month = 2, year = 2016
-- DONE
select twitter_user.screen_name, twitter_user.category, twt.textbody, twt.retweet_count, url.address
from twitter_user
join tweet as twt on twt.posting_user = twitter_user.screen_name
join tweet_url as url on url.tid = twt.tid
where month(twt.posted) = 2
and year(twt.posted) = 2016
order by twt.retweet_count desc
limit 5;

-- Q23 where k = 5, subcategroy = "GOP", month = [1,2,3], year = 2016
select hashtag.tag_name, count(twt.tid) as num_uses
from tweet_tag as hashtag
join tweet as twt on twt.tid = hashtag.tid
join twitter_user as users on users.screen_name = twt.posting_user
where users.subcategory = "GOP"
and year(twt.posted) = 2016
and month(twt.posted) between 1 and 3
order by count(twt.tid) desc
limit 5;