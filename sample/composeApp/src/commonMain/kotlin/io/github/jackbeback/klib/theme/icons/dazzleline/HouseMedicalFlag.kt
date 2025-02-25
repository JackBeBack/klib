package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseMedicalFlag: ImageVector
    get() {
        if (_HouseMedicalFlag != null) {
            return _HouseMedicalFlag!!
        }
        _HouseMedicalFlag = ImageVector.Builder(
            name = "HouseMedicalFlag",
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
                moveTo(12f, 11f)
                verticalLineTo(17f)
                moveTo(12f, 14f)
                horizontalLineTo(9f)
                moveTo(15f, 3f)
                verticalLineTo(21f)
                moveTo(15f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                moveTo(5f, 10f)
                verticalLineTo(16.2f)
                curveTo(5f, 17.88f, 5f, 18.72f, 5.327f, 19.362f)
                curveTo(5.615f, 19.927f, 6.074f, 20.385f, 6.638f, 20.673f)
                curveTo(7.28f, 21f, 8.12f, 21f, 9.8f, 21f)
                horizontalLineTo(12f)
                moveTo(3f, 12f)
                lineTo(12f, 3f)
            }
        }.build()

        return _HouseMedicalFlag!!
    }

@Suppress("ObjectPropertyName")
private var _HouseMedicalFlag: ImageVector? = null
