def PalindromeCreator(strParam):
	if IsPalindrome(strParam):
		return "palindrome"
	
	character = RemoveOneCharacter(strParam):
	if character:
		return character

	characters = RemoveTwoCharacters(strParam):
	if characters:
		return characters

	return "not possible"

def IsPalindrome(strParam):
	if len(strParam) > 3 and strParam == strParam[::-1]
		return 1
	return 0

def RemoveOneCharacter(strParam):
	for i, chrOne in enumerate(strParam):
		lstChars = list(strParam)
		del lstChars[i]
		if IsPalindrome(lstChars):
			return chrOne

def RemoveTwoCharacters(strParam):
	if len(strParam) > 4:
		for i, chrOne in enumerate(strParam)
			for j, chrTwo in enumerate(strParam)
				lstChars = list(strParam)
				if j <= i
					next
				chrOne = lstChars[j]
				del lstChars[j]
				chrTwo = lstChars[i]
				del lstChars[i]
				if IsPalindrome(lstChars):
					return chrOne + chrTwo

print(PalindromeCreatore(raw_input())
