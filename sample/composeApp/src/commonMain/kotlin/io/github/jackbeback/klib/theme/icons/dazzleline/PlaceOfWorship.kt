package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PlaceOfWorship: ImageVector
    get() {
        if (_PlaceOfWorship != null) {
            return _PlaceOfWorship!!
        }
        _PlaceOfWorship = ImageVector.Builder(
            name = "PlaceOfWorship",
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
                moveTo(4.5f, 14f)
                lineTo(3f, 15f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                moveTo(7f, 21f)
                horizontalLineTo(10f)
                moveTo(7f, 21f)
                verticalLineTo(13f)
                lineTo(9.5f, 11f)
                verticalLineTo(6f)
                lineTo(12f, 3f)
                lineTo(14.5f, 6f)
                verticalLineTo(11f)
                lineTo(17f, 13f)
                verticalLineTo(21f)
                moveTo(10f, 21f)
                horizontalLineTo(14f)
                moveTo(10f, 21f)
                verticalLineTo(17f)
                curveTo(10f, 15.895f, 10.895f, 15f, 12f, 15f)
                curveTo(13.105f, 15f, 14f, 15.895f, 14f, 17f)
                verticalLineTo(21f)
                moveTo(14f, 21f)
                horizontalLineTo(17f)
                moveTo(17f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                lineTo(19.5f, 14f)
            }
        }.build()

        return _PlaceOfWorship!!
    }

@Suppress("ObjectPropertyName")
private var _PlaceOfWorship: ImageVector? = null
