package moe.sqwatermark.muicontextmenutest;

import icyllis.modernui.fragment.Fragment;
import icyllis.modernui.graphics.drawable.ColorDrawable;
import icyllis.modernui.util.DataSet;
import icyllis.modernui.view.LayoutInflater;
import icyllis.modernui.view.View;
import icyllis.modernui.view.ViewGroup;
import org.jetbrains.annotations.NotNull;

public class TestFragment extends Fragment {

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, DataSet savedInstanceState) {
        View view = new View(getContext());
        view.setBackground(new ColorDrawable(0xFF000000));
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        view.setOnCreateContextMenuListener((menu, v, menuInfo) -> {
            menu.add("1");
            menu.add("2");
            menu.add("3");
            menu.add("4");
            menu.add("5");
            menu.add("6");
        });
        return view;
    }
}
