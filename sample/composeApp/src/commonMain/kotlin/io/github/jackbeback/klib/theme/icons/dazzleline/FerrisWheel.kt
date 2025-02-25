package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FerrisWheel: ImageVector
    get() {
        if (_FerrisWheel != null) {
            return _FerrisWheel!!
        }
        _FerrisWheel = ImageVector.Builder(
            name = "FerrisWheel",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.938f, 11f)
                curveTo(20.069f, 11f, 20.261f, 11.026f, 20.383f, 11.076f)
                curveTo(20.504f, 11.126f, 20.614f, 11.2f, 20.707f, 11.293f)
                curveTo(20.8f, 11.386f, 20.874f, 11.496f, 20.924f, 11.617f)
                curveTo(20.974f, 11.739f, 21f, 11.869f, 21f, 12f)
                curveTo(21f, 12.131f, 20.974f, 12.261f, 20.924f, 12.383f)
                curveTo(20.874f, 12.504f, 20.8f, 12.614f, 20.707f, 12.707f)
                curveTo(20.614f, 12.8f, 20.504f, 12.874f, 20.383f, 12.924f)
                curveTo(20.261f, 12.974f, 20.069f, 13f, 19.938f, 13f)
                moveTo(20f, 12f)
                curveTo(20f, 7.582f, 16.418f, 4f, 12f, 4f)
                moveTo(20f, 12f)
                horizontalLineTo(16f)
                moveTo(20f, 12f)
                curveTo(20f, 13.347f, 19.667f, 14.616f, 19.079f, 15.73f)
                moveTo(4.062f, 13f)
                curveTo(3.931f, 13f, 3.739f, 12.974f, 3.617f, 12.924f)
                curveTo(3.496f, 12.874f, 3.386f, 12.8f, 3.293f, 12.707f)
                curveTo(3.2f, 12.614f, 3.126f, 12.504f, 3.076f, 12.383f)
                curveTo(3.026f, 12.261f, 3f, 12.131f, 3f, 12f)
                curveTo(3f, 11.869f, 3.026f, 11.739f, 3.076f, 11.617f)
                curveTo(3.126f, 11.496f, 3.2f, 11.386f, 3.293f, 11.293f)
                curveTo(3.386f, 11.2f, 3.496f, 11.126f, 3.617f, 11.076f)
                curveTo(3.739f, 11.026f, 3.931f, 11f, 4.062f, 11f)
                moveTo(4f, 12f)
                horizontalLineTo(8f)
                moveTo(4f, 12f)
                curveTo(4f, 9.791f, 4.895f, 7.791f, 6.343f, 6.343f)
                moveTo(4f, 12f)
                curveTo(4f, 13.348f, 4.333f, 14.618f, 4.922f, 15.731f)
                moveTo(5.571f, 7.238f)
                curveTo(5.468f, 7.135f, 5.363f, 6.989f, 5.307f, 6.854f)
                curveTo(5.251f, 6.719f, 5.222f, 6.575f, 5.222f, 6.429f)
                curveTo(5.222f, 6.283f, 5.251f, 6.138f, 5.307f, 6.004f)
                curveTo(5.363f, 5.869f, 5.444f, 5.746f, 5.548f, 5.643f)
                curveTo(5.651f, 5.54f, 5.773f, 5.458f, 5.908f, 5.402f)
                curveTo(6.043f, 5.346f, 6.187f, 5.318f, 6.333f, 5.318f)
                curveTo(6.479f, 5.318f, 6.624f, 5.346f, 6.758f, 5.402f)
                curveTo(6.893f, 5.458f, 7.018f, 5.557f, 7.121f, 5.66f)
                moveTo(16.858f, 5.643f)
                curveTo(16.961f, 5.54f, 17.107f, 5.458f, 17.242f, 5.402f)
                curveTo(17.376f, 5.346f, 17.521f, 5.318f, 17.667f, 5.318f)
                curveTo(17.813f, 5.318f, 17.957f, 5.346f, 18.092f, 5.402f)
                curveTo(18.227f, 5.458f, 18.349f, 5.54f, 18.452f, 5.643f)
                curveTo(18.556f, 5.746f, 18.637f, 5.869f, 18.693f, 6.004f)
                curveTo(18.749f, 6.138f, 18.778f, 6.283f, 18.778f, 6.429f)
                curveTo(18.778f, 6.575f, 18.749f, 6.719f, 18.693f, 6.854f)
                curveTo(18.637f, 6.989f, 18.533f, 7.136f, 18.43f, 7.239f)
                moveTo(11f, 4.062f)
                curveTo(11f, 3.931f, 11.026f, 3.739f, 11.076f, 3.617f)
                curveTo(11.126f, 3.496f, 11.2f, 3.386f, 11.293f, 3.293f)
                curveTo(11.386f, 3.2f, 11.496f, 3.126f, 11.617f, 3.076f)
                curveTo(11.739f, 3.026f, 11.869f, 3f, 12f, 3f)
                curveTo(12.131f, 3f, 12.261f, 3.026f, 12.383f, 3.076f)
                curveTo(12.504f, 3.126f, 12.614f, 3.2f, 12.707f, 3.293f)
                curveTo(12.8f, 3.386f, 12.874f, 3.496f, 12.924f, 3.617f)
                curveTo(12.974f, 3.739f, 13f, 3.931f, 13f, 4.062f)
                moveTo(12f, 4f)
                verticalLineTo(8f)
                moveTo(12f, 4f)
                curveTo(9.791f, 4f, 7.791f, 4.895f, 6.343f, 6.343f)
                moveTo(9f, 9f)
                lineTo(6.343f, 6.343f)
                moveTo(15f, 9f)
                lineTo(17.667f, 6.353f)
                moveTo(11.594f, 12.914f)
                curveTo(11.718f, 12.969f, 11.855f, 13f, 12f, 13f)
                curveTo(12.145f, 13f, 12.282f, 12.969f, 12.406f, 12.914f)
                moveTo(11.594f, 12.914f)
                curveTo(11.244f, 12.758f, 11f, 12.408f, 11f, 12f)
                curveTo(11f, 11.448f, 11.448f, 11f, 12f, 11f)
                curveTo(12.552f, 11f, 13f, 11.448f, 13f, 12f)
                curveTo(13f, 12.408f, 12.756f, 12.758f, 12.406f, 12.914f)
                moveTo(11.594f, 12.914f)
                lineTo(8f, 21f)
                horizontalLineTo(16f)
                lineTo(12.406f, 12.914f)
                moveTo(4.922f, 15.731f)
                curveTo(4.904f, 15.739f, 4.885f, 15.747f, 4.868f, 15.755f)
                curveTo(4.735f, 15.817f, 4.616f, 15.904f, 4.518f, 16.011f)
                curveTo(4.419f, 16.119f, 4.343f, 16.245f, 4.293f, 16.382f)
                curveTo(4.243f, 16.519f, 4.221f, 16.665f, 4.227f, 16.811f)
                curveTo(4.233f, 16.956f, 4.268f, 17.099f, 4.33f, 17.232f)
                curveTo(4.392f, 17.364f, 4.479f, 17.483f, 4.586f, 17.581f)
                curveTo(4.694f, 17.68f, 4.82f, 17.756f, 4.957f, 17.806f)
                lineTo(5.717f, 15.718f)
                curveTo(5.58f, 15.668f, 5.434f, 15.646f, 5.289f, 15.652f)
                curveTo(5.163f, 15.658f, 5.039f, 15.684f, 4.922f, 15.731f)
                close()
                moveTo(19.079f, 15.73f)
                curveTo(18.963f, 15.684f, 18.84f, 15.658f, 18.715f, 15.652f)
                curveTo(18.569f, 15.646f, 18.424f, 15.668f, 18.287f, 15.718f)
                lineTo(19.047f, 17.806f)
                curveTo(19.184f, 17.756f, 19.31f, 17.68f, 19.417f, 17.581f)
                curveTo(19.525f, 17.483f, 19.612f, 17.364f, 19.674f, 17.232f)
                curveTo(19.735f, 17.1f, 19.771f, 16.956f, 19.777f, 16.811f)
                curveTo(19.783f, 16.665f, 19.761f, 16.519f, 19.711f, 16.382f)
                curveTo(19.661f, 16.245f, 19.584f, 16.119f, 19.486f, 16.011f)
                curveTo(19.387f, 15.904f, 19.269f, 15.817f, 19.136f, 15.755f)
                curveTo(19.117f, 15.746f, 19.098f, 15.738f, 19.079f, 15.73f)
                close()
                moveTo(12f, 12f)
                horizontalLineTo(12.01f)
            }
        }.build()

        return _FerrisWheel!!
    }

@Suppress("ObjectPropertyName")
private var _FerrisWheel: ImageVector? = null
