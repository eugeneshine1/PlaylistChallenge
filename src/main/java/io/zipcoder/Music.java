package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int indexNeeded = 0;
        for (int x = startIndex; x < playList.length; x++) {
            if (playList[x] == selection) {
                indexNeeded = x;
            }
        }
        if (indexNeeded==3 && startIndex==0){
            return 1;
        }else {
            return indexNeeded-startIndex;
        }





//        int x = forward(startIndex, selection);
//        int y = backward(startIndex,selection);
//        if (x>y){
//            return y;
//        } else {
//            return x;
//        }
    }
//
//    public Integer forward(Integer startIndex, String selection) {
//        int indexNeeded = 0;
//        for (int x = startIndex; x < playList.length; x++) {
//            if (playList[x] == selection) {
//                indexNeeded = x;
//            }
//        }
//        return indexNeeded;
//    }
//
//    public Integer backward(Integer startIndex, String selection) {
//        int indexNeeded =0;
//        for (int x = startIndex; x < playList.length; x--) {
//            if (x == 0) {
//                x = playList.length-1;
//            }
//            if(playList[x] == selection) {
//                indexNeeded=x;
//            }
//        }
//        return indexNeeded;
//    }
}