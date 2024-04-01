def StringReduction(strParam):
  # code goes here
  lstCounts = [strParam.count('a'), strParam.count('b'), strParam.count('c')]
  while lstCounts.count(0)<2:
    lstCounts.sort(reverse=True)
    lstCounts[0] -= 1
    lstCounts[1] -= 1
    lstCounts[2] += 1

  return max(lstCounts)

# keep this function call here 
print StringReduction(raw_input())
