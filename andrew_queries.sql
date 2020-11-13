-- Q3 k = 5 and year = 2016
SELECT tweet_tag.tag_name, group_concat(DISTINCT tUser.state ORDER BY tUser.state) as States, COUNT(DISTINCT tUser.state) AS num_states
FROM tweet_tag
JOIN tweet ON tweet.tid = tweet_tag.tid
JOIN twitter_user AS tUser ON tUser.screen_name = tweet.posting_user
WHERE tUser.state != "" and tUser.state != "na" and year(tweet.posted) = '2016'
GROUP BY tweet_tag.tag_name
ORDER BY num_states DESC
LIMIT 5;

-- Q9 sub-category = 'Democrat' k = 5
SELECT twitter_user.screen_name, twitter_user.subcategory, twitter_user.numFollowers
FROM twitter_user
WHERE twitter_user.subcategory = 'Democrat'
ORDER BY twitter_user.numFollowers DESC
LIMIT 5;

-- Q18 k = 5 sub-category = 'GOP', month = 4, year = 2016
SELECT mentioned.screen_name, mentioned.state, COUNT(men.tid), group_concat(DISTINCT mentionee.screen_name ORDER BY mentionee.screen_name) as Mentionees
FROM twitter_user mentioned
JOIN mention AS men ON men.screen_name = mentioned.screen_name
JOIN tweet ON tweet.tid = men.tid AND month(tweet.posted) = 4 AND year(tweet.posted) = 2016
JOIN twitter_user AS mentionee ON mentionee.screen_name = tweet.posting_user
WHERE mentioned.subcategory = 'GOP'
GROUP BY mentioned.screen_name
ORDER BY COUNT(men.tid) DESC
LIMIT 5;

-- Insert
INSERT INTO twitter_user (screen_name, name, numFollowers, category, subcategory, state)
VALUES ('screen_name', 'name', 0)


