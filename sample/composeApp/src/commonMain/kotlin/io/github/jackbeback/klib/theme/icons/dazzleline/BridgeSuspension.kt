package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BridgeSuspension: ImageVector
    get() {
        if (_BridgeSuspension != null) {
            return _BridgeSuspension!!
        }
        _BridgeSuspension = ImageVector.Builder(
            name = "BridgeSuspension",
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
                moveTo(3f, 6f)
                curveTo(3f, 6f, 4.5f, 5f, 6f, 3f)
                moveTo(6f, 3f)
                curveTo(6.941f, 4.647f, 7.994f, 5.63f, 9f, 6.209f)
                moveTo(6f, 3f)
                verticalLineTo(12f)
                moveTo(9f, 6.209f)
                curveTo(10.132f, 6.86f, 11.206f, 7f, 12f, 7f)
                moveTo(9f, 6.209f)
                verticalLineTo(12f)
                moveTo(12f, 7f)
                curveTo(12.794f, 7f, 13.868f, 6.86f, 15f, 6.209f)
                moveTo(12f, 7f)
                verticalLineTo(12f)
                moveTo(15f, 6.209f)
                curveTo(16.007f, 5.63f, 17.059f, 4.647f, 18f, 3f)
                moveTo(15f, 6.209f)
                verticalLineTo(12f)
                moveTo(18f, 3f)
                curveTo(19.5f, 5f, 21f, 6f, 21f, 6f)
                moveTo(18f, 3f)
                verticalLineTo(12f)
                moveTo(6f, 12f)
                horizontalLineTo(3f)
                moveTo(6f, 12f)
                horizontalLineTo(9f)
                moveTo(18f, 12f)
                horizontalLineTo(15f)
                moveTo(18f, 12f)
                horizontalLineTo(21f)
                moveTo(15f, 12f)
                horizontalLineTo(12f)
                moveTo(12f, 12f)
                horizontalLineTo(9f)
                moveTo(21f, 16f)
                curveTo(19.343f, 16f, 18f, 17.343f, 18f, 19f)
                verticalLineTo(20f)
                curveTo(18f, 20.552f, 17.552f, 21f, 17f, 21f)
                horizontalLineTo(16f)
                curveTo(15.448f, 21f, 15f, 20.552f, 15f, 20f)
                verticalLineTo(19f)
                curveTo(15f, 17.343f, 13.657f, 16f, 12f, 16f)
                curveTo(10.343f, 16f, 9f, 17.343f, 9f, 19f)
                verticalLineTo(20f)
                curveTo(9f, 20.552f, 8.552f, 21f, 8f, 21f)
                horizontalLineTo(7f)
                curveTo(6.448f, 21f, 6f, 20.552f, 6f, 20f)
                verticalLineTo(19f)
                curveTo(6f, 17.343f, 4.657f, 16f, 3f, 16f)
            }
        }.build()

        return _BridgeSuspension!!
    }

@Suppress("ObjectPropertyName")
private var _BridgeSuspension: ImageVector? = null
