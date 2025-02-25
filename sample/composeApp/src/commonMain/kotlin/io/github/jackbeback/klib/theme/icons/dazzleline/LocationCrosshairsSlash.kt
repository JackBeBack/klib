package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LocationCrosshairsSlash: ImageVector
    get() {
        if (_LocationCrosshairsSlash != null) {
            return _LocationCrosshairsSlash!!
        }
        _LocationCrosshairsSlash = ImageVector.Builder(
            name = "LocationCrosshairsSlash",
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
                moveTo(12f, 3f)
                verticalLineTo(5f)
                moveTo(12f, 5f)
                curveTo(15.866f, 5f, 19f, 8.134f, 19f, 12f)
                moveTo(12f, 5f)
                curveTo(11.561f, 5f, 11.131f, 5.04f, 10.714f, 5.118f)
                moveTo(12f, 19f)
                verticalLineTo(21f)
                moveTo(12f, 19f)
                curveTo(8.134f, 19f, 5f, 15.866f, 5f, 12f)
                moveTo(12f, 19f)
                curveTo(13.933f, 19f, 15.683f, 18.216f, 16.95f, 16.95f)
                moveTo(3f, 12f)
                horizontalLineTo(5f)
                moveTo(5f, 12f)
                curveTo(5f, 10.065f, 5.785f, 8.313f, 7.054f, 7.046f)
                moveTo(19f, 12f)
                horizontalLineTo(21f)
                moveTo(19f, 12f)
                curveTo(19f, 12.439f, 18.96f, 12.868f, 18.883f, 13.284f)
                moveTo(12f, 15f)
                curveTo(10.343f, 15f, 9f, 13.657f, 9f, 12f)
                moveTo(12f, 15f)
                curveTo(12.768f, 15f, 13.469f, 14.711f, 14f, 14.236f)
                moveTo(12f, 15f)
                curveTo(12.827f, 15f, 13.577f, 14.665f, 14.119f, 14.123f)
                moveTo(9f, 12f)
                curveTo(9f, 11.232f, 9.289f, 10.531f, 9.764f, 10f)
                moveTo(9f, 12f)
                curveTo(9f, 11.172f, 9.336f, 10.422f, 9.879f, 9.879f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
            }
        }.build()

        return _LocationCrosshairsSlash!!
    }

@Suppress("ObjectPropertyName")
private var _LocationCrosshairsSlash: ImageVector? = null
