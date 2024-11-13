// src/main/java/com/example/nonograms/Cell.java

package com.example.nonograms;

import android.content.Context;
import androidx.appcompat.widget.AppCompatButton;

public class Cell extends AppCompatButton {
    private boolean blackSquare;  // 검은색 사각형 여부
    private boolean isXMarked;    // "X" 표시 여부

    public Cell(Context context) {
        super(context);
        init();
    }

    private void init() {
        setBackgroundResource(R.drawable.cell_selector);  // 셀의 기본 배경 설정
    }

    public void setBlackSquare(boolean blackSquare) {
        this.blackSquare = blackSquare;
    }

    // 검은색 사각형을 발견하려고 시도
    public boolean markBlackSquare() {
        if (blackSquare) {
            setText("B");  // 검은 사각형이면 "B" 표시
            setEnabled(false);
            return true;  // 올바른 클릭
        } else {
            setText("X");  // 잘못된 클릭이면 "X" 표시
            return false;  // 잘못된 클릭
        }
    }

    // "X" 표시를 토글
    public void toggleX() {
        isXMarked = !isXMarked;
        setText(isXMarked ? "X" : "");  // "X"를 표시하거나 제거
    }

    public boolean isBlackSquare() {
        return blackSquare;
    }
}
