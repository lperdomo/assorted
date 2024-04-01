def ArrayJumping(arr):
  # code goes here
  hst = {}
  intMaxId = arr.index(max(arr))
  intLength = len(arr)

  for i in range(intLength):
    hst[i] = (Left(intLength, i, arr[i]), Right(intLength, i, arr[i]))

  if intMaxId in hst[intMaxId]:
    return 1

  setJump = set(hst[intMaxId])

  for intStep in range(2, intLength+1):
    for intVal in tuple(setJump):
      setJump.add(hst[intVal][0])
      setJump.add(hst[intVal][1])
    if intMaxId in setJump:
      return intStep

  return -1

def Left(intLength, intId, intNum):
  intLeft = intNum % intLength
  if intLeft > intId:
    return intLength + intId - intLeft
  else:
    return intId - intLeft

def Right(intLength, intId, intNum):
  intRight = intNum % intLength
  if intRight > intLength - intId - 1:
    return intRight + intId - intLength
  else:
    return intRight + intId


# keep this function call here 
print ArrayJumping(raw_input())
