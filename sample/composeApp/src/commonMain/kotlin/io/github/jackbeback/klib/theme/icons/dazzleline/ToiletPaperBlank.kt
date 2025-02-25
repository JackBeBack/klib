package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ToiletPaperBlank: ImageVector
    get() {
        if (_ToiletPaperBlank != null) {
            return _ToiletPaperBlank!!
        }
        _ToiletPaperBlank = ImageVector.Builder(
            name = "ToiletPaperBlank",
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
                moveTo(15f, 10f)
                curveTo(15f, 13.314f, 16.343f, 16f, 18f, 16f)
                curveTo(19.657f, 16f, 21f, 13.314f, 21f, 10f)
                curveTo(21f, 6.686f, 19.657f, 4f, 18f, 4f)
                moveTo(15f, 10f)
                curveTo(15f, 6.686f, 16.343f, 4f, 18f, 4f)
                moveTo(15f, 10f)
                verticalLineTo(14f)
                curveTo(15f, 15.844f, 14.475f, 18.726f, 14f, 20f)
                horizontalLineTo(3f)
                curveTo(3.475f, 18.726f, 4f, 15.844f, 4f, 14f)
                verticalLineTo(10f)
                curveTo(4f, 6.686f, 5.343f, 4f, 7f, 4f)
                horizontalLineTo(18f)
            }
        }.build()

        return _ToiletPaperBlank!!
    }

@Suppress("ObjectPropertyName")
private var _ToiletPaperBlank: ImageVector? = null
