package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Clarinet: ImageVector
    get() {
        if (_Clarinet != null) {
            return _Clarinet!!
        }
        _Clarinet = ImageVector.Builder(
            name = "Clarinet",
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
                moveTo(10f, 10.5f)
                verticalLineTo(7f)
                moveTo(13f, 10.5f)
                verticalLineTo(7f)
                moveTo(16f, 10.5f)
                verticalLineTo(7f)
                moveTo(8f, 7f)
                horizontalLineTo(18f)
                moveTo(12f, 13.5f)
                horizontalLineTo(12.01f)
                moveTo(8f, 13.5f)
                horizontalLineTo(8.01f)
                moveTo(16f, 13.5f)
                horizontalLineTo(16.01f)
                moveTo(3f, 12f)
                verticalLineTo(15f)
                lineTo(5f, 16.5f)
                horizontalLineTo(18f)
                lineTo(21f, 18f)
                verticalLineTo(9f)
                lineTo(18f, 10.5f)
                horizontalLineTo(5f)
                lineTo(3f, 12f)
                close()
                moveTo(12.5f, 13.5f)
                curveTo(12.5f, 13.776f, 12.276f, 14f, 12f, 14f)
                curveTo(11.724f, 14f, 11.5f, 13.776f, 11.5f, 13.5f)
                curveTo(11.5f, 13.224f, 11.724f, 13f, 12f, 13f)
                curveTo(12.276f, 13f, 12.5f, 13.224f, 12.5f, 13.5f)
                close()
                moveTo(8.5f, 13.5f)
                curveTo(8.5f, 13.776f, 8.276f, 14f, 8f, 14f)
                curveTo(7.724f, 14f, 7.5f, 13.776f, 7.5f, 13.5f)
                curveTo(7.5f, 13.224f, 7.724f, 13f, 8f, 13f)
                curveTo(8.276f, 13f, 8.5f, 13.224f, 8.5f, 13.5f)
                close()
                moveTo(16.5f, 13.5f)
                curveTo(16.5f, 13.776f, 16.276f, 14f, 16f, 14f)
                curveTo(15.724f, 14f, 15.5f, 13.776f, 15.5f, 13.5f)
                curveTo(15.5f, 13.224f, 15.724f, 13f, 16f, 13f)
                curveTo(16.276f, 13f, 16.5f, 13.224f, 16.5f, 13.5f)
                close()
            }
        }.build()

        return _Clarinet!!
    }

@Suppress("ObjectPropertyName")
private var _Clarinet: ImageVector? = null
