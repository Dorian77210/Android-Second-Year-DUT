package com.example.controleisv1;

public class Model {

    public static final int SMALL_SELECTED_INDEX = 0;
    public static final int MEDIUM_SELECTED_INDEX = 1;
    public static final int LARGE_SELECTED_INDEX = 2;

    private boolean selectedCases[];

    public Model() {
        this.selectedCases = new boolean[3];
    }

    public void setSelected(int index, boolean isSelected) {
        this.selectedCases[index] = isSelected;
    }

    public boolean isSelected(int index) {
        return this.selectedCases[index];
    }
}
