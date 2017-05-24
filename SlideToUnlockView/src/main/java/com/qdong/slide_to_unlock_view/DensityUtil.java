package com.qdong.slide_to_unlock_view;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;

public class DensityUtil {

	@Deprecated
	public static int dip2px(Context paramContext, float paramFloat) {
		return (int) (0.5F + paramFloat
				* paramContext.getResources().getDisplayMetrics().density);
	}

	@Deprecated
	public static int px2dip(Context context, float paramFloat) {
		return (int) (0.5F + paramFloat
				/ context.getResources().getDisplayMetrics().density);
	}

	@Deprecated
	public static int sp2px(Context context, float spValue) {
		final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
		return (int) (spValue * fontScale + 0.5f);
	}

	@Deprecated
	public static int px2sp(Context context, float value) {
		final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
		return (int) (value / fontScale + 0.5f);
	}

	public static int dip2px(float density, float value) {
		return (int) (0.5F + value * density);
	}

	public static int px2dip(float density, float value) {
		return (int) (0.5F + value / density);
	}

	public static int sp2px(float scaledDensity, float value) {
		return (int) (0.5F + value * scaledDensity);
	}

	public static int px2sp(float fontScale /** scaledDensity */
	, float value) {
		return (int) (value / fontScale + 0.5f);

	
	}
	
	public static final int getStatusHeighByDensity(Context context) {
		int h = 38;
		int density = context.getResources().getDisplayMetrics().densityDpi;

		switch (density) {
		case 120:
			h = 19;
			break;
		case 160:
			h = 25;
			break;
		case 240:
			h = 38;
			break;
		case 320:
			h = 50;
			break;
		case 400:
			h = 63;
			break;
		case 480:
			h = 75;
			break;
		default:
			break;
		}

		return h;
	}

	private static int displayWidth, displayHeight;

	private static void initDisplay(Context context) {
		DisplayMetrics dm = new DisplayMetrics();
		((WindowManager) context.getApplicationContext().getSystemService(
				Context.WINDOW_SERVICE)).getDefaultDisplay().getMetrics(dm);

		displayWidth = dm.widthPixels;

		displayHeight = dm.heightPixels;
	}

	
	public static final int getDisplayWidth(Context context) {
		if (displayWidth == 0) {
			initDisplay(context);
		}
		return displayWidth;
	}

	
	public static final int getDisplayHeight(Context context) {
		if (displayHeight == 0) {
			initDisplay(context);
		}
		return displayHeight;
	}
	
	public static int dp2px(Context context, int dp) {
		return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,context.getResources().getDisplayMetrics());
	}

	public static int dp2px(Context context, float dp) {
		return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,context.getResources().getDisplayMetrics());
	}

	public static int px2dp(Context context, int px) {
		return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PX, px,context.getResources().getDisplayMetrics());
	}
	
	public static int px2sp(Context context, int px) {
		return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, px,context.getResources().getDisplayMetrics());
	}

	public static int getScreenWidth(Context context)
	{
		WindowManager wm = (WindowManager) context
				.getSystemService(Context.WINDOW_SERVICE );
		DisplayMetrics outMetrics = new DisplayMetrics();
		wm.getDefaultDisplay().getMetrics( outMetrics);
		return outMetrics .widthPixels ;
	}
}
