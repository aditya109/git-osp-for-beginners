# Contributed by @mcole18
# assumes input is of the form 
# player_name2 : score2, ..., player_nameN : scoreN
# ex:
# Stacie : 22, Tom : 2, Arnold : 11, ..., Marnie : 5

string = input()
player_scores = dict((name.strip(), score.strip())
	for name, score in (player_tuple.split(':')
		for player_tuple in string.split(', ')))

top_scorer = next(iter(player_scores))
for player in player_scores:
	if int(player_scores[top_scorer]) < int(player_scores[player]):
		top_scorer = player

print('The top scorer is: ' + top_scorer + ' with ' + player_scores[top_scorer] + ' runs.')
