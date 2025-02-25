package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BuildingNgo: ImageVector
    get() {
        if (_BuildingNgo != null) {
            return _BuildingNgo!!
        }
        _BuildingNgo = ImageVector.Builder(
            name = "BuildingNgo",
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
                moveTo(20f, 15f)
                verticalLineTo(16.2f)
                curveTo(20f, 17.88f, 20f, 18.72f, 19.673f, 19.362f)
                curveTo(19.385f, 19.927f, 18.927f, 20.385f, 18.362f, 20.673f)
                curveTo(17.72f, 21f, 16.88f, 21f, 15.2f, 21f)
                horizontalLineTo(8.8f)
                curveTo(7.12f, 21f, 6.28f, 21f, 5.638f, 20.673f)
                curveTo(5.074f, 20.385f, 4.615f, 19.927f, 4.327f, 19.362f)
                curveTo(4f, 18.72f, 4f, 17.88f, 4f, 16.2f)
                verticalLineTo(15f)
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                moveTo(3f, 11f)
                verticalLineTo(7f)
                lineTo(7f, 11f)
                verticalLineTo(7f)
                moveTo(14f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                moveTo(14f, 21f)
                verticalLineTo(17f)
                curveTo(14f, 15.895f, 13.105f, 15f, 12f, 15f)
                curveTo(10.895f, 15f, 10f, 15.895f, 10f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                close()
                moveTo(18f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _BuildingNgo!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingNgo: ImageVector? = null
