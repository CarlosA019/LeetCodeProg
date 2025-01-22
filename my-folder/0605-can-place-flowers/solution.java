class Solution{
	public boolean canPlaceFlowers(int[] flowerbed, int n){
//we want to look into the array and want to check if that space has been occupied AND if the previous and next space have been taken. 
int length= flowerbed.length;
int flowersPlanted = 0;

//now we want to loop through array and count the number of flowers
for (int i =0; i<length; i++){
if(flowerbed[i]==0 &&
//ok we want to make sure its in bonds so if i==0 theres nothing before it and if i==array.length there is nothing after it.
//before
(i==0 || flowerbed[i-1] ==0) &&
//after
(i==length - 1 || flowerbed[i+1] ==0)
){
	flowersPlanted++;
    flowerbed[i] = 1;
}
}
//now finally we want to return the boolean for the int n;
if(flowersPlanted >= n){
	return true;
} else {
return false;
}
}
}

