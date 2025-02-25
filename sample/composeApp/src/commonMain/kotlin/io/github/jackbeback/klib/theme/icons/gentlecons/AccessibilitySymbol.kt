package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.AccessibilitySymbol: ImageVector
    get() {
        if (_AccessibilitySymbol != null) {
            return _AccessibilitySymbol!!
        }
        _AccessibilitySymbol = ImageVector.Builder(
            name = "AccessibilitySymbol",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 6.83f)
                curveTo(10.165f, 6.418f, 11f, 5.306f, 11f, 4f)
                curveTo(11f, 2.343f, 9.657f, 1f, 8f, 1f)
                curveTo(6.343f, 1f, 5f, 2.343f, 5f, 4f)
                curveTo(5f, 5.306f, 5.835f, 6.418f, 7f, 6.83f)
                verticalLineTo(12f)
                curveTo(7f, 13.657f, 8.343f, 15f, 10f, 15f)
                horizontalLineTo(14.93f)
                curveTo(15.264f, 15f, 15.576f, 15.167f, 15.762f, 15.446f)
                lineTo(18.491f, 19.54f)
                curveTo(19.191f, 20.59f, 20.677f, 20.737f, 21.57f, 19.845f)
                lineTo(22.707f, 18.707f)
                curveTo(23.098f, 18.317f, 23.098f, 17.684f, 22.707f, 17.293f)
                curveTo(22.317f, 16.903f, 21.683f, 16.903f, 21.293f, 17.293f)
                lineTo(20.155f, 18.431f)
                lineTo(17.426f, 14.336f)
                curveTo(16.869f, 13.502f, 15.933f, 13f, 14.93f, 13f)
                horizontalLineTo(10f)
                curveTo(9.448f, 13f, 9f, 12.552f, 9f, 12f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                curveTo(15.552f, 11f, 16f, 10.552f, 16f, 10f)
                curveTo(16f, 9.448f, 15.552f, 9f, 15f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(6.83f)
                close()
                moveTo(8f, 5.108f)
                curveTo(7.388f, 5.108f, 6.893f, 4.612f, 6.893f, 4f)
                curveTo(6.893f, 3.389f, 7.388f, 2.893f, 8f, 2.893f)
                curveTo(8.612f, 2.893f, 9.107f, 3.389f, 9.107f, 4f)
                curveTo(9.107f, 4.612f, 8.612f, 5.108f, 8f, 5.108f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(4.633f, 9.074f)
                curveTo(5.105f, 8.79f, 5.697f, 9.028f, 5.916f, 9.534f)
                curveTo(6.136f, 10.04f, 5.896f, 10.62f, 5.438f, 10.927f)
                curveTo(4.93f, 11.267f, 4.48f, 11.691f, 4.109f, 12.183f)
                curveTo(3.536f, 12.941f, 3.169f, 13.835f, 3.044f, 14.776f)
                curveTo(2.919f, 15.719f, 3.04f, 16.677f, 3.396f, 17.558f)
                curveTo(3.751f, 18.44f, 4.329f, 19.214f, 5.072f, 19.806f)
                curveTo(5.815f, 20.398f, 6.699f, 20.787f, 7.638f, 20.936f)
                curveTo(8.576f, 21.085f, 9.538f, 20.988f, 10.428f, 20.655f)
                curveTo(11.318f, 20.322f, 12.106f, 19.765f, 12.717f, 19.037f)
                curveTo(13.113f, 18.565f, 13.425f, 18.031f, 13.643f, 17.46f)
                curveTo(13.839f, 16.945f, 14.351f, 16.581f, 14.894f, 16.681f)
                curveTo(15.436f, 16.782f, 15.8f, 17.305f, 15.629f, 17.83f)
                curveTo(15.333f, 18.737f, 14.864f, 19.583f, 14.247f, 20.319f)
                curveTo(13.415f, 21.312f, 12.34f, 22.072f, 11.127f, 22.525f)
                curveTo(9.914f, 22.979f, 8.604f, 23.111f, 7.325f, 22.908f)
                curveTo(6.046f, 22.705f, 4.841f, 22.174f, 3.828f, 21.368f)
                curveTo(2.815f, 20.561f, 2.028f, 19.506f, 1.544f, 18.305f)
                curveTo(1.06f, 17.104f, 0.895f, 15.798f, 1.065f, 14.514f)
                curveTo(1.235f, 13.23f, 1.735f, 12.012f, 2.516f, 10.979f)
                curveTo(3.095f, 10.212f, 3.815f, 9.567f, 4.633f, 9.074f)
                close()
            }
        }.build()

        return _AccessibilitySymbol!!
    }

@Suppress("ObjectPropertyName")
private var _AccessibilitySymbol: ImageVector? = null
