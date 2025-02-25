package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CoinsAlt: ImageVector
    get() {
        if (_CoinsAlt != null) {
            return _CoinsAlt!!
        }
        _CoinsAlt = ImageVector.Builder(
            name = "CoinsAlt",
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
                moveTo(14f, 10.5f)
                curveTo(14f, 11.881f, 11.761f, 13f, 9f, 13f)
                curveTo(6.239f, 13f, 4f, 11.881f, 4f, 10.5f)
                moveTo(14f, 10.5f)
                curveTo(14f, 9.119f, 11.761f, 8f, 9f, 8f)
                curveTo(6.239f, 8f, 4f, 9.119f, 4f, 10.5f)
                moveTo(14f, 10.5f)
                verticalLineTo(14.5f)
                moveTo(4f, 10.5f)
                verticalLineTo(14.5f)
                moveTo(20f, 5.5f)
                curveTo(20f, 4.119f, 17.761f, 3f, 15f, 3f)
                curveTo(13.021f, 3f, 11.31f, 3.575f, 10.5f, 4.409f)
                moveTo(20f, 5.5f)
                curveTo(20f, 6.425f, 18.994f, 7.233f, 17.5f, 7.666f)
                moveTo(20f, 5.5f)
                verticalLineTo(14f)
                curveTo(20f, 14.74f, 18.994f, 15.387f, 17.5f, 15.732f)
                moveTo(20f, 10f)
                curveTo(20f, 10.757f, 18.949f, 11.415f, 17.4f, 11.755f)
                moveTo(14f, 14.5f)
                curveTo(14f, 15.881f, 11.761f, 17f, 9f, 17f)
                curveTo(6.239f, 17f, 4f, 15.881f, 4f, 14.5f)
                moveTo(14f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(14f, 19.881f, 11.761f, 21f, 9f, 21f)
                curveTo(6.239f, 21f, 4f, 19.881f, 4f, 18.5f)
                verticalLineTo(14.5f)
            }
        }.build()

        return _CoinsAlt!!
    }

@Suppress("ObjectPropertyName")
private var _CoinsAlt: ImageVector? = null
