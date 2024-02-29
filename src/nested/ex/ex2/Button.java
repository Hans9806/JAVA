package nested.ex.ex2;

public class Button {
    private OnClickListener onClickListener;

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
    public void click() {
        if (onClickListener != null) {
            onClickListener.onClick();
        }
    }
}
