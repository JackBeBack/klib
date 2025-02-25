package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BuildingColumns: ImageVector
    get() {
        if (_BuildingColumns != null) {
            return _BuildingColumns!!
        }
        _BuildingColumns = ImageVector.Builder(
            name = "BuildingColumns",
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
                moveTo(4f, 21f)
                horizontalLineTo(10f)
                moveTo(14f, 21f)
                horizontalLineTo(20f)
                moveTo(4f, 17.5f)
                horizontalLineTo(10f)
                moveTo(14f, 17.5f)
                horizontalLineTo(20f)
                moveTo(4f, 14f)
                horizontalLineTo(10f)
                moveTo(14f, 14f)
                horizontalLineTo(20f)
                moveTo(19f, 8.444f)
                verticalLineTo(5f)
                moveTo(12f, 7.007f)
                lineTo(12.007f, 7f)
                moveTo(12f, 3f)
                lineTo(21f, 10f)
                horizontalLineTo(3f)
                lineTo(12f, 3f)
                close()
            }
        }.build()

        return _BuildingColumns!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingColumns: ImageVector? = null
